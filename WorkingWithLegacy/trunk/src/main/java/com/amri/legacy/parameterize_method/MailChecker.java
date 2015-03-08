package com.amri.legacy.parameterize_method;

public class MailChecker {
	private MailServer mailServer;

	public void setupMail()
	{
		mailServer = new MailServer();
		mailServer.setup();
	}
}
