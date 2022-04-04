package bankdetailsofcustomer;

public class managerdetails {
	
	  private String firstName;
	  private String lastName;
	  private int age;
	  private managerAddress address;

	  public managerdetails( String fName, String lName, int age, managerAddress address )
	  {
		firstName = fName;
		lastName = lName;
		this.age = age;
		this.address = address;
	  }
	public String toString()
	  {
		return "manager's Name: " + firstName + " " + lastName + "\n" + "manager's Age: " + age + "\nmanager's Address: \n" + address;
	  }
	}

