package New;


public class SecondLevelCacheEhCacheInHibernate {
	
	/*Caching in Hibernate :
		
	Hibernate caching improves the performance of the application by pooling the object in the cache.

	There are mainly two types of caching: first level cache and second level cache.
	
	First Level Cache :
	Session object holds the first level cache data. It is enabled by default. 
	The first level cache data will not be available to entire application. Becoz An application can use many session object.
	
	Second Level Cache:
	SessionFactory object holds the second level cache data. 
	The data stored in the second level cache will be available to entire application. But we need to enable it explicitely.
	Second Level Cache implementations are provided by different vendors such as:
    EH Cache
    OS Cache
    Swarm Cache
    JBoss Cache
    
    Hibernate second level cache uses a common cache for all the session object of a session factory. 
    It is useful if you have multiple session objects from a session factory.

	SessionFactory holds the second level cache data. It is global for all the session objects and not enabled by default. 

	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");  
	SessionFactory factory=cfg.buildSessionFactory();  
      
    Session session1=factory.openSession();  
    Employee emp1=(Employee)session1.load(Employee.class,121);  
    System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());  
    session1.close();  
      
    Session session2=factory.openSession();  
    Employee emp2=(Employee)session2.load(Employee.class,121);  
    System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());  
    session2.close();  
    
    If you use second level cache : After executing above code you will see in the console that only one time query fired.
    As we can see here, hibernate does not fire query twice. 
    If you don't use second level cache, hibernate will fire query twice because both query uses different session objects.
	
	*/
	
		//In spring boot how to enable second level cache :
		
		/*application.properties file add:
		spring.jpa.properties.hibernate.cache.region.factory_class: org.hibernate.cache.ehcache.EhCacheRegionFactory*/
	
		/*Application.class:

			@EnableAutoConfiguration
			@Configuration
			@ComponentScan
			public class Application {

			    public static void main(String[] args) throws Exception {
			        SpringApplication.run(Application.class, args);
			    }
			}*/
	
	
	/*CacheConfig.class:

		@Configuration
		@EnableCaching
		public class CachingConfig implements CachingConfigurer {

		    @Bean
		    @Override
		    public CacheManager cacheManager() {
		        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
		        cacheManager.setCacheManager(ehCacheManagerFactoryBean().getObject());
		        return cacheManager;
		    }

		    @Bean
		    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
		        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
		        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		        ehCacheManagerFactoryBean.setCacheManagerName("messageCache");
		        ehCacheManagerFactoryBean.setShared(true);
		        return ehCacheManagerFactoryBean;
		    }
		}*/
	
	/*ehcache.xml:

		<?xml version="1.0" encoding="UTF-8"?>
		<ehcache>
		    <defaultCache eternal="true" maxElementsInMemory="100" overflowToDisk="false" />
		    <cache name="messageCache" maxElementsInMemory="10" eternal="true" overflowToDisk="false" />
		</ehcache>*/
	
	/*ehcache.xml

    <?xml version="1.0"?>  
    <ehcache>  
    <defaultCache   
    maxElementsInMemory="100"   
    eternal="false"   
    timeToIdleSeconds="120"   
    timeToLiveSeconds="200" />  
      
    <cache name="com.javatpoint.Employee"   
    maxElementsInMemory="100"   
    eternal="false"   
    timeToIdleSeconds="5"   
    timeToLiveSeconds="200" />  
    </ehcache> */
	
	/*You need to create ehcache.xml file to define the cache property.

	defaultCache: will be used for all the persistent classes. We can also define persistent class explicitely by using the 
	cache element.

	eternal: If we specify eternal="true", we don't need to define timeToIdleSeconds and timeToLiveSeconds attributes 
	because it will be handled by hibernate internally. Specifying eternal="false" gives control to the programmer, 
	but we need to define timeToIdleSeconds and timeToLiveSeconds attributes.

	timeToIdleSeconds : It defines that how many seconds object can be idle in the second level cache.

	timeToLiveSeconds : It defines that how many seconds object can be stored in the second level cache whether it is 
	idle or not.*/
	
	/*MyEntity:

		@Entity
		@XmlRootElement
		@Table(name = "my_entity")
		@Cacheable(value = true)
		@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
		public class MyEntity { ... }*/
	
	/*Each implementation provides different cache usage functionality. There are four ways to use second level cache.

    read-only: caching will work for read only operation.
    nonstrict-read-write: caching will work for read and write but one at a time.
    read-write: caching will work for read and write, can be used simultaneously.
    transactional: caching will work for transaction. (EH cache vendor dont provide transaction support)
*/
	
	/*Instances may exist in one of the following three states at a given point in time:

	    transient: A new instance of a persistent class which is not associated with a Session and has no representation 
	    in the database and no identifier value is considered transient by Hibernate.

	    persistent: You can make a transient instance persistent by associating it with a Session. 
	    A persistent instance has a representation in the database, an identifier value and is associated with a Session.

	    detached: Once we close the Hibernate Session, the persistent instance will become a detached instance.
*/
	
}
