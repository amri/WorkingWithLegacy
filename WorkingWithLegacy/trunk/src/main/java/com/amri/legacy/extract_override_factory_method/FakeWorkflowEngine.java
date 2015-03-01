package com.amri.legacy.extract_override_factory_method;

public class FakeWorkflowEngine extends WorkflowEngine {

	public class FakeTransactionManager extends TransactionManager {

	}

	@Override
	public TransactionManager makeTransactionManager() {
		
		return new FakeTransactionManager();
	}

}
