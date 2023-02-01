package ATMDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMDemo extends BankAccount{
	
	//Scanner input = new Scanner(System.in);

	int password;
	
	List<Integer> list = new ArrayList<Integer>();
	
	public void getLogin() {
	
	System.out.println("Enter Password!");
	
	list.add(254838);
	list.add(974048);
	
	int password = input.nextInt();
	
		if (list.contains(password)) 
		{
			System.out.println("Welcome to Account");
		}
			else 
			{
				System.out.println("Invalid password");	
				
			}
		
		checkAccount();
	}
	
	public void checkAccount() { 
	
	System.out.println("Please Select Your Transaction");
	System.out.println("1:Checking Deposit");
	System.out.println("2:Saving Deposit");
	System.out.println("3:Withdrawing Deposit");
	System.out.println("4:Exit");
	System.out.println("5:Getting Transactions");
	
	int selection = input.nextInt();


	switch (selection) { 
	
		case 1:	
			
			System.out.println("Available Account : " + balance);
			
			getBalance();
			
			checkAccount();
		break;
		
		case 2:
		
			System.out.println("Input for depositing money");
		
			deposit();	
		
			System.out.println("New Balance: " + balance);
			
			checkAccount();
		 
		break;
		
		case 3:
		
			System.out.println("Input for withdrawing money");	
			
			withdraw();

			System.out.println("New Balance: " + balance);
			
			checkAccount();	
		break;
		
		case 4:
			
			System.out.println("Account closing");
		
			checkAccount();	
		break;
		
		case 5:
			
			System.out.println("Transactions is ready");
			try {
			getTransactions(transactions);
			//printTransaction((transactions));
			}catch (Throwable t) {
				t.printStackTrace();
			}
			checkAccount();
		break;
		
		default:
			System.out.println("Invalid Selection");
			checkAccount();
			}
		}
	

	public static void main(String[] args) {
		
	ATMDemo atm = new ATMDemo();
		
		atm.getLogin();
	
	}

}
