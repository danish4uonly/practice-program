package New.ComparablePackage;

//If this.countryId < country.countryId:then compare method will return -1
//If this.countryId > country.countryId:then compare method will return 1
//If this.countryId==country.countryId:then compare method will return 0

public class Country implements Comparable<Country>{
  String countryId;
  String countryName;
  
  
  public Country(String countryId, String countryName) {
      super();
      this.countryId = countryId;
      this.countryName = countryName;
  }
  
  @Override
  public int compareTo(Country country) {
	  
     // return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
	  
	  //If countryId is string then we have to do this like below if it is int then we have to do above one ternary operator.
      //int countryComparition = this.getCountryId().compareTo(country.getCountryId());
	  //or
	  int countryComparition = this.countryId.compareTo(country.countryId);
	  //Based on country name we are sorting.
	  //int countryComparition = this.countryName.compareTo(country.countryName);
      return countryComparition;
  }

	public String getCountryId() {
		return countryId;
	}
	
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
  
}
