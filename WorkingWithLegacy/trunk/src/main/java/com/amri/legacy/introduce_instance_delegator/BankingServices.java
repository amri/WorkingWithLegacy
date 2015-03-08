package com.amri.legacy.introduce_instance_delegator;

//MAIN
public class BankingServices {
	public static void updateAccountBalance(int userID, Money amount)
	{
		//
	}
	
	public void updateBalance(int userID, Money amount)
	{
		this.updateAccountBalance(userID, amount);
		
	}
}
