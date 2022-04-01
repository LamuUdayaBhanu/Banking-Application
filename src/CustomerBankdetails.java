package bankdetailsofcustomer;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


class CustomerBankdetails {
		
		static Scanner customer = new Scanner(System.in);
		String name, acctype, email;
	    private static String accNo;
		long balance;
		int amount;
		long phno;
		int pT,pT1;
		float intr;
		
		String B_name,B_branch,B_address;
		int B_code;
	
		LocalDate date = LocalDate.now();   
		LocalTime time = LocalTime.now();
		LocalDateTime DT = LocalDateTime.now();

		CustomerBankdetails(String name, String num,String type, long bal, long phno, String email, float in) { //constructor
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
			
		public void Bankdetails(String bname, int code, String branch, String add, String IFSC) { //constructor
			
			System.out.println("Bank Name :" + bname);
			System.out.println("Bank Code :" + code);
			System.out.println("Bank Branch : " + branch);
			System.out.println("bank Address:" + add);
			System.out.println("Bank IFSC code:"+ IFSC);
		}
		
		int deposit() { //method
			System.out.print("Enter amount to deposit:");
			amount = customer.nextInt();
			if (amount < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			//Updates the account balances and returns resulting balance
			balance = balance + amount;
			System.out.println("Interest: " +intr);
			System.out.println("deposited time and date: " +  time + "," + date);  
			System.out.println("Your Amount is Successfully Deposited");
			return 0;
		}

		int withdrawal() { //method
			System.out.println("Your Balance=" + balance);
			System.out.print("Enter withdrawal amount:");
			amount = customer.nextInt();
			if (balance < amount) {
				System.out.println("Not sufficient balance.");
				return 1;
			}
			else if (amount < 0) {
				System.out.println(" In-Valid amount ");
				return 1;
			}
			//Updates the account balances and returns resulting balance
				balance = balance - amount;
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
			String num = customer.next();
			System.out.println("Account Type: ");
			String type = customer.next();
			System.out.println("Minimum Account Balance: ");
			long bal = customer.nextLong();
			System.out.println("Phone Number:");
			long phno= customer.nextLong();
			System.out.println("Mail Id: ");
			String email = customer.next();
			System.out.println("Enter Account Intrest:");
			float in = customer.nextFloat();
			CustomerBankdetails c = new CustomerBankdetails(name,num,type, bal,phno,email,in);
		
			int Select;
			System.out.println("..............Display Customer Bank Application Details.........");
			System.out.println("1. Bank details");
			System.out.println("2. Customer details");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Withdrawal Amount");
			System.out.println("5. Bank balance");
			System.out.println("6. Interest");
			System.out.println("7. Account number valid or not?");
			System.out.println("0. Exit");
			boolean exit = false;
			do {
				System.out.print("Please enter your choice: ");
				Select = customer.nextInt();
				switch (Select) {
				case 1: System.out.println("");
						System.out.println("WELCOME TO " +bname+ " BANK");
						System.out.println("");
						c.Bankdetails(bname, code, branch, add, IFSC);
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
					
				case 7: 
						
				case 0: System.out.println("Thank You For Visiting " +bname+ " Bank");
						exit = true;
					    break;
			   
				
				}
			} while (!exit);
		
		}

		
}



