package com.amri.legacy.extract_override_factory_method;

//MAIN
public class WorkflowEngine {

	public WorkflowEngine() {
		this.tm = makeTransactionManager();
	}

	public TransactionManager makeTransactionManager() {
		Reader reader = new ModelReader(AppConfig.getDryConfiguration());
		return new TransactionManager(reader);
	}
	
	private TransactionManager tm;
}
