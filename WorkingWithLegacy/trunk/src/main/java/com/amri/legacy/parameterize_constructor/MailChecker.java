package com.amri.legacy.parameterize_constructor;

//MAIN
public class MailChecker {
	private MailReceiver receiver;
	private int checkPeriodSeconds;

	public MailChecker(int checkPeriodSeconds)
	{
		this(checkPeriodSeconds, new MailReceiver());
	}
	
	public MailChecker(int checkPeriodSeconds, MailReceiver receiver)
	{
		this.receiver = receiver;
		this.checkPeriodSeconds = checkPeriodSeconds;
	}
}
