package New.comparatorPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    
    public static void main(String[] args) {
        Country indiaCountry=new Country(1, "India");
        Country chinaCountry=new Country(3, "USA");
        Country nepalCountry=new Country(4, "Russia");
        Country bhutanCountry=new Country(2, "Japan");
        
        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);
        
        System.out.println("Before Sort by id : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            Country country=(Country) listOfCountries.get(i);
            System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
        }
        
        //System.out.println("1111111111111111");
        Collections.sort(listOfCountries,new CountrySortByIdComparator());
        //System.out.println("2222222222222222222222");
        
        System.out.println("After Sort by id: ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            Country country=(Country) listOfCountries.get(i);
            System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
        }
        
        //__________________________________________________________________________
        
        //IN above also we can sort multiple times , just create one more class CountrySortByNameComparator and do same as CountrySortByIdComparator, we can create as more as we can, which is not possible in comparable.
        
       // or without creating class we can do like this :
        
        // At a time we are sorting mutilple times based on id and names in comparator.
        
       //Sort by countryName
        Collections.sort(listOfCountries,new Comparator<Country>() {
            
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });
        
        System.out.println("After Sort by name: ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            Country country=(Country) listOfCountries.get(i);
            System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
        }
        
        
        //Sort by countryId
    	Collections.sort(listOfCountries,new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
            	return (o1.getCountryId() < o2.getCountryId() ) ? -1: (o1.getCountryId() > o2.getCountryId() ) ? 1:0 ;
            }
    	});
        	
    	  System.out.println("After Sort by id *******: ");
          for (int i = 0; i < listOfCountries.size(); i++) {
              Country country=(Country) listOfCountries.get(i);
              System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
          }
    }
    
}
