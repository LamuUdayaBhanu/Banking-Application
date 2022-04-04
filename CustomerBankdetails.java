package bankdetailsofcustomer;

// importing packages
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
//import bankdetailsofcustomer.managerAddress;
//import bankdetailsofcustomer.managerdetails;

//declaring class with className
class CustomerBankdetails {
		
		// Initializing Variables
		static Scanner customer = new Scanner(System.in);
		String name,  email;
	    private static int accNo;
		double balance;
		int Damount,Wamount;
		long phno;
		float intr;
	    String acctype;
	    private static managerdetails Bankmanager;
	    //private static managerAddress managerAddress;
		
	   
		LocalDate date = LocalDate.now();   
		LocalTime time = LocalTime.now();
		LocalDateTime DT = LocalDateTime.now();
	
		//Parameterized constructor
		CustomerBankdetails(String name, int num,String type, double bal, long phno, String email, float in) { 
			this.name = name;
			CustomerBankdetails.accNo= num;  //accNo declaring static 
			this.acctype =type;
			this.balance = bal;
			this.phno = phno;
			this.email = email;
			this.intr =in;
		}
		
		void displaycustomerdetails() { //method
				System.out.println("Account Holder Name :" + name);
				System.out.println("Account No:" + accNo);
				System.out.println("Account Type: " + acctype);
				System.out.println("Account Balance:" + balance);
				System.out.println("Customer mail id: " + email);
		}
		
		 //constructor
		void Bankdetails( int code,String bname, String branch, String add, String IFSC) {
			
			System.out.println("Bank Name :" + bname);
			System.out.println("Bank Code :" + code);
			System.out.println("Bank Branch : " + branch);
			System.out.println("bank Address:" + add);
			System.out.println("Bank IFSC code:"+ IFSC);
		}
		
		int deposit() { //method
			System.out.print("Enter amount to deposit:");
			Damount = customer.nextInt();
			if (Damount < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			//Updates the account balances and returns resulting balance
			balance = balance + Damount;	
			System.out.println("Interest: " +intr);
			System.out.println("deposited time and date: " +  time + "," + date);  
			System.out.println("Your Amount is Successfully Deposited");
			return 0;
		}

		int withdrawal() { //method
			System.out.println("Your Balance=" + balance);
			System.out.print("Enter withdrawal amount:");
			Wamount = customer.nextInt();
			if (balance < Wamount) {
				System.out.println("Not sufficient balance. so, can't withdrawal");
				return 1;
			}
			else if (Wamount < 0) {
				System.out.println(" In-Valid amount ");
				return 1;
			}
			//Updates the account balances and returns resulting balance
				balance = balance - Wamount;
				System.out.println("withdrawal time and date: " +time + " ," + date );  
				System.out.println("Your Amount is Successfully Removed");
				return 0;
		}		

		void bankbal() { //method
			System.out.println("Balance:" + balance);
		}
		
		public void calculateintrest(){ //method
			double it=(balance*intr)/100;
			System.out.println("Interest for daily: "+it);
			System.out.println("date and time format: " +DT); 
		}

	public static void main(String args[]) {
	
		//managerAddress = managerAddress;
		managerAddress managerAddress = new managerAddress( "RoyNagar", "Gannavaram", 521101, 9010532114L, "uday7214@gmail.com" );
		managerdetails managerdetails = new managerdetails( "UdayKumar", "Lamu", 35, managerAddress);
	
			System.out.println("..................Enter Bank Details...........................");
			System.out.println("Bank Branch code:");
			int code = customer.nextInt();
			System.out.println("Bank Name:");
			String bname = customer.next();
			System.out.println("Bank Branch Location: ");
			String branch = customer.next();
			System.out.println("Bank Location:");
			String add = customer.next();
			System.out.println("Enter IFSC Code:");
			String IFSC = customer.next();
			
			System.out.println();
			
			System.out.println("..................Enter Customer Bank Application Details............... ");
			System.out.println("Customer Name: ");
			String name = customer.next();
			System.out.println("Account Number: ");
			int num = customer.nextInt();
			System.out.println("Account Type: ");
			String type = customer.next();
			System.out.println("Minimum Account Balance: ");
			double bal = customer.nextDouble();
			System.out.println("Phone Number:");
			long phno= customer.nextLong();
			System.out.println("Mail Id: ");
			String email = customer.next();
			System.out.println("Enter Account Intrest:");
			float in = customer.nextFloat();
			CustomerBankdetails c = new CustomerBankdetails(name,num,type, bal,phno,email,in);
		
			int Select;
			System.out.println("");
			System.out.println("..............Display Customer Bank Application Details.........");
			System.out.println("1. Bank details");
			System.out.println("2. Customer details");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Withdrawal Amount");
			System.out.println("5. Bank balance");
			System.out.println("6. Interest");
			System.out.println("0. Exit");
			boolean exit = false;
			
			do {
				System.out.println("");
				System.out.print("Please enter your choice: ");
				Select = customer.nextInt();
				switch (Select) {
				case 1: System.out.println("");
						System.out.println("WELCOME TO " +bname+ " BANK");
						System.out.println("");
						c.Bankdetails(code, bname, branch, add, IFSC);
						System.out.println("");
						System.out.println(managerdetails);
						System.out.println(managerAddress);
						System.out.println("");
						break;
						
				case 2:	System.out.println("");
						System.out.println("DETAILS OF ACCOUNT_HOLDER");
						System.out.println("");
						c.displaycustomerdetails();
						System.out.println("");
			    		break;
				
				case 3: c.deposit();
						System.out.println("");
					    break;

				case 4:	c.withdrawal();
				 		System.out.println("");
					    break;	
						
				case 5: c.bankbal(); 
						System.out.println("");
						break;
						
				case 6: c.calculateintrest();
						System.out.println("");
						break;
							
				case 0: System.out.println("***************Thank You For Visiting " +bname+ " Bank*******************");
						exit = true;
					    break;
			   
				
				}
			} while (!exit);
		
		}

	public static managerdetails getBankmanager() {
		return Bankmanager;
	}

	public static void setBankmanager(managerdetails bankmanager) {
		Bankmanager = bankmanager;
	}
	}
	

	

		




