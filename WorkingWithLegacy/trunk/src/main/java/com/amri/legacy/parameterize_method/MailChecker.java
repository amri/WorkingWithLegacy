package com.amri.legacy.parameterize_method;

public class MailChecker {
	private MailServer mailServer;

	public void setupMail()
	{
		setupMail(new MailServer());
	}

	public void setupMail(MailServer mailServer)
	{
		this.mailServer = mailServer;
		mailServer.setup();
	}

}
