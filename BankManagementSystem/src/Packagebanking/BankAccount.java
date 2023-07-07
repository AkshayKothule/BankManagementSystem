package Packagebanking;

import java.util.Random;
 class Bank
{
	 protected  int actnumber;
	 protected String customerName;
	 protected int actBalance;
	
	
}
 

public class BankAccount extends Bank  {
	
	
	
	
	public BankAccount() {
		System.out.println("current bank processing ");
		
		
	}
	public BankAccount(int actnumber, String customerName, int actBalance) {
		//super();
		this.setActnumber(actnumber);
		this.customerName = customerName;
		this.actBalance = actBalance;
	}
	public int getActnumber() {
		return actnumber;
	}
	public void setActnumber(int actnumber) {
		this.actnumber = actnumber;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getActBalance() {
		return actBalance;
	}
	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
	public void deposite(int depositeAmount )
	{
		//after performing deposit we need to store the deposite details in
		//an object of transaction class
		//and then store that object in some collection such as linked list
		//for future reference
		Random r= new Random();
		//this class various method randomly generate int float double 
		
		actBalance=actBalance+depositeAmount;
		Transaction t= new Transaction(r.nextInt() ,
				getActnumber() , depositeAmount ,"deposit",actBalance);
		TransctionDetails.addTransaction(t);
		System.out.println("deposit completed and transaction stored ......");
		
	}
	public void withdraw(int withdrawAmount)
	{
		if(withdrawAmount > actBalance)
		{
			//System.out.println("balance is insufficient");
			//throw new InSufficientBalanceException();
			try {
				throw new InSufficientBalanceException();
				
			}
			catch(InSufficientBalanceException e)
			{
				e.printStackTrace();
				//System.out.println("balance is insufficient ");
				
			}
			
		}
		actBalance=actBalance-withdrawAmount;
		Random r= new Random();
		
		Transaction t= new Transaction(r.nextInt() ,
				getActnumber() , withdrawAmount ,"withdraw",actBalance);
		TransctionDetails.addTransaction(t);
		System.out.println("withdraw completed and transaction stored ......");
		
		
		//after performing withdraw  we need to store the withdraw details in
				//an object of transaction class
				//and then store that object in some collection such as linked list
				//for future reference
		
	}
	
	
	
	

}
