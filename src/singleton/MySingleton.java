package singleton;

/*
 * A journey to write double checked locking of Singleton class in Java.
 */
public class MySingleton {
	
	private volatile static MySingleton _instance;

    private MySingleton() {
        // preventing Singleton object instantiation from outside
    }

    /*
     * 1st version: creates multiple instance if two thread access
     * this method simultaneously
     */

    public static MySingleton getInstance() {
        if (_instance == null) {
            _instance = new MySingleton();
        }
        return _instance;
    }

    /*
     * 2nd version : this definitely thread-safe and only
     * creates one instance of Singleton on concurrent environment
     * but unnecessarily expensive due to cost of synchronization
     * at every call.
     */

    public static synchronized MySingleton getInstanceTS() {
        if (_instance == null) {
            _instance = new MySingleton();
        }
        return _instance;
    }

    /*
     * 3rd version : An implementation of double checked locking of Singleton.
     * Intention is to minimize cost of synchronization and  improve performance,
     * by only locking critical section of code, the code which creates
 instance of Singleton class.
     * By the way this is still broken, if we don't make _instance volatile,
 as another thread can
     * see a half initialized instance of Singleton.
     */

    public static MySingleton getInstanceDC() {
        if (_instance == null) {
            synchronized (MySingleton.class) {
                if (_instance == null) {
                    _instance = new MySingleton();
                }
            }
        }
        return _instance;
    }
    
    /*If we do not make the _instance variable volatile than the Thread which is creating instance of 
    Singleton is not able to communicate other thread, that instance has been created until it comes out 
    of the Singleton block, so if Thread A is creating Singleton instance and just after creation lost the CPU, 
    all other thread will not be able to see value of _instance as not null and they will believe its still null.*/
    
    
    /**
     * So Singleton can be break by three way :
     * 1. Reflection    --> to avoid use enum for object creation as enum dont have constructor , user cannot call constructor of enum, jvm is responsible internally to call constructor of enum.
     * 2. Serialization  --> To overcome this issue, we have to implement method readResolve() method.
     * // implement readResolve method
	    protected Object readResolve()
	    {
	        return instance;
	    }
     * 3. Clone  --> implements cloneable interface and override clone method and inside that :throw new CloneNotSupportedException();
     * @Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    throw new CloneNotSupportedException();
	  }
     */


}
