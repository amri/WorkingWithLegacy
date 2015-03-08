package com.amri.legacy.test.introduce_instance_delegator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amri.legacy.introduce_instance_delegator.BankingServices;
import com.amri.legacy.introduce_instance_delegator.Money;

public class BankingServicesTest {

	@Test
	public void testWithStatic() {
		int userID = 0;
		Money amount = null;
		BankingServices.updateAccountBalance(userID, amount);
	}

	@Test
	public void testWithInstance() {
		int userID = 0;
		Money amount = null;
		BankingServices services = new BankingServices();
		
		services.updateBalance(userID, amount);
	}
}
