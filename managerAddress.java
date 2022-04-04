package bankdetailsofcustomer;

public class managerAddress {
	
	  private String street;
	  private String city;
	  private int pincode;
	  private long phoneNumber;
	  private String emailID;
	  
	  public managerAddress( String street, String city, int pincode, long phNumber, String email )
	  {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		phoneNumber = phNumber;
		emailID = email;
	  }

	  public String toString()
	  {
		return "\t" + street + "\n\t" + city + " - " + pincode + "\n\tPhone No: " + phoneNumber + "\n\te-mail ID: " + emailID;
	  }
	
}
