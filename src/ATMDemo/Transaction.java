package ATMDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class Transaction {
		
		// DateTimeFormatter format = new DateTimeFormatter("hh:mm:ss a dd/MM/yy");
		
		LocalDateTime transactionTime = LocalDateTime.now();
		
		Scanner input = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
	
		double balance;
		
		double amount;
	    
		String transaction; 
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		public double getAmount() {
			return amount;
		}
		
		public void setTransactionTime(LocalDateTime transactionTime ) {
			this.transactionTime = transactionTime;
		}
		
		public LocalDateTime getTransactionTime() {
			return transactionTime;
		}
				
		public void setTransaction(String transaction) {
			this.transaction = transaction;
		}
		public String getTransaction() {
			return transaction;
		}
		
		@Override
		public String toString() {
			return "Transaction Type : " + transaction + " Transaction Amount : " + Double.toString(amount) + " Transaction DateTime : " + sb.append(transactionTime); 
		}
		
	}


