package Packagebanking;

public class BankMain {
	public static void main(String[] args)
	{
		BankAccount b1= new BankAccount(101 ,"Akshay" , 15000);
		
		b1.deposite(1000);
		b1.deposite(500);
		b1.deposite(700);
		b1.withdraw(3500);
		b1.withdraw(500);
		b1.deposite(500);
		b1.withdraw(700);
		
		System.out.println("**************************");
		TransctionDetails.showMiniStatement(101);
		
		
		
		
		
		
		
		
	}

}
