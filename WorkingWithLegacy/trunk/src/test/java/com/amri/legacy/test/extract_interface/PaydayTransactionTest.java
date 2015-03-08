package com.amri.legacy.test.extract_interface;
import static org.junit.Assert.*;

import org.junit.Test;

import com.amri.legacy.extract_interface.FakeTransactionLog;
import com.amri.legacy.extract_interface.PaydayTransaction;
import com.amri.legacy.extract_interface.PayrollDatabase;
import com.amri.legacy.extract_interface.Transaction;


public class PaydayTransactionTest {

	@Test
	public void testPayday() {
		FakeTransactionLog aLog = new FakeTransactionLog();
		Transaction t = new PaydayTransaction(getTestingDatabase(), aLog);
		t.run();
		//assertEquals(getSampleCheck(12),getTestingDatabase.findCheck(12));
	}

	private PayrollDatabase getTestingDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

}
