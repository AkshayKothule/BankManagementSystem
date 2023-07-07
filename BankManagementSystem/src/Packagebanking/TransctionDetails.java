package Packagebanking;

import java.util.LinkedList;
import java.util.List;

public class TransctionDetails {
	public static List<Transaction> transctionList=new LinkedList<>();
	public static void addTransaction(Transaction t)
	{
		transctionList.add(t);
	}
	public static void showMiniStatement(int actNumber)
	{
		System.out.println("Mini statement for account Number : "+actNumber);
		System.out.println();
		
		for(Transaction t : transctionList)
		{
			if(t.getActNumber()==actNumber)
			{
				System.out.println(t.getTranNumber()+" -"+"THIS IS TRANSATION :"+t.getBalanceAfterThisTransaction());
				
			}
		}
		
		
		
		
		
	}

}
