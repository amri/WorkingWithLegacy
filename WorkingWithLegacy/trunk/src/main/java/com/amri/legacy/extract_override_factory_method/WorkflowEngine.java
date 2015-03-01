package com.amri.legacy.extract_override_factory_method;

//MAIN
public class WorkflowEngine {

	public WorkflowEngine() {
		Reader reader = new ModelReader(AppConfig.getDryConfiguration());
		this.tm = new TransactionManager(reader);
	}
	
	private TransactionManager tm;
}
