package com.amri.legacy.parameterize_constructor;

//MAIN
public class MailChecker {
	private MailReceiver receiver;
	private int checkPeriodSeconds;

	public MailChecker(int checkPeriodSeconds)
	{
		this.receiver = new MailReceiver();
		this.checkPeriodSeconds = checkPeriodSeconds;
	}
}
