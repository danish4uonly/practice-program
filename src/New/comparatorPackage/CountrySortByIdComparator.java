package New.comparatorPackage;

import java.util.Comparator;

//If country1.getCountryId() < country2.getCountryId():then compare method will return -1
//If country1.getCountryId() > country2.getCountryId():then compare method will return 1
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0

public class CountrySortByIdComparator implements Comparator<Country>{
  
  @Override
  public int compare(Country country1, Country country2) {
	 /* System.out.println("aaaaaaaa");
	  System.out.println(country1.getCountryId());
	  System.out.println(country2.getCountryId());*/
	  
	  //based on name : as it is string
	  //int comp = country1.getCountryName().compareTo(country2.getCountryName());
      //return comp;
	  
	  //based on Id -- as it is int
      return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
  }
  
}
