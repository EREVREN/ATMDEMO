package ATMDemo;


import java.util.ArrayList;
import java.util.List;

import java.text.DecimalFormat;

public class BankAccount extends Transaction{
	
	
	DecimalFormat df = new DecimalFormat("0.00");

	
	List <Transaction> transactions = new ArrayList<>();
	
	public void deposit () {

		amount = input.nextDouble();
		this.balance = balance + amount;
		this.setTransaction("Deposit");
		this.setAmount(amount);
		this.setTransactionTime(transactionTime);
	    transactions.add(this);
	   
	}
	
	public void withdraw() {
		amount = input.nextDouble();
	    this.balance = balance - amount; 
		
	    if (isOverDrawn()) {
	    
			this.balance = balance + amount; 
			System.out.println("Account is not adequate"); 
	    }
	     
		this.setTransaction("Withdraw");
		this.setAmount(amount);
		this.setTransactionTime(transactionTime);
	    transactions.add(this);
	 	}
	
	public double getBalance () {
		this.setTransaction("CheckingBalance");
		this.setAmount(amount);
		this.setTransactionTime(transactionTime);
	    transactions.add(this);		
		return balance; 
		
	}
	
	boolean isOverDrawn() {
	    if(balance < 0) {
	        return true;
	    } else {
	        return false;
	    }
	}

	public Transaction getTransactions () {
		
		for(Transaction a : transactions)
			
			return a;
			
		return null;
		
	}

	@Override
	public String toString() {
		return "Transaction Type: " + transactions + "Transaction Amount : " + amount + "Transaction DateTime :" + transactionTime; 
	}
		
}






	


	

