package com.amri.legacy.extract_interface;

//MAIN
public class PaydayTransaction extends Transaction{
	PayrollDatabase database;
	TransactionRecorder log;
	
	public PaydayTransaction(PayrollDatabase database, TransactionRecorder log) {
		this.database = database;
		this.log = log;
	}
	
	public void run()
	{
		log.saveTransaction(this);
	}
}
