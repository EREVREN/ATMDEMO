package ATMDemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.text.DecimalFormat;
import java.lang.String;

public class BankAccount extends Transaction{
	
	
	DecimalFormat df = new DecimalFormat("0.00");

	List<Transaction> transactions = new ArrayList<>();
	Transaction t1 = new Transaction();
	Transaction t2 = new Transaction();
	Transaction t3 = new Transaction();
	/**
	 * 
	 */
	public void deposit () {

		amount = input.nextDouble();
		this.balance = balance + amount;
		t1.setTransaction("Depositing");
		t1.setAmount(amount);
		t1.setTransactionTime(transactionTime);
	    transactions.add(t1);
	   
	}
	
	public void withdraw() {
		amount = input.nextDouble();
	    this.balance = balance - amount; 
		
	    if (isOverDrawn()) {
	    
			this.balance = balance + amount; 
			System.out.println("Account is not adequate"); 
	    }
	     
		t2.setTransaction("Withdrawing");
		t2.setAmount(amount);
		t2.setTransactionTime(transactionTime);
	    transactions.add(t2);
	 	}
	
	public double getBalance () {
		t3.setTransaction("CheckingBalance");
		t3.setAmount(amount);
		t3.setTransactionTime(transactionTime);
	    transactions.add(t3);		
		return balance; 
		
	}
	
	boolean isOverDrawn() {
	    if(balance < 0) {
	        return true;
	    } else {
	        return false;
	    }
	}

	
	

	public void getTransactions (List<Transaction> lst) {
		for(Transaction a : transactions){
		System.out.println(a.toString());} 
		} 	
		/*Iterator<Transaction> itr = lst.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			} }*/
		/*public static void printTransaction (List<?> myList) {
		System.out.println(myList); }*/
		
	
	@Override
	public int hashCode() {
		return Objects.hash(t1, t2, t3, transactions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(t1, other.t1) && Objects.equals(t2, other.t2) && Objects.equals(t3, other.t3)
				&& Objects.equals(transactions, other.transactions);
	}
		
}






	


	

