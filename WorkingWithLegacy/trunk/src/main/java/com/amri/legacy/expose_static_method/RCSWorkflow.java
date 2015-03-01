package com.amri.legacy.expose_static_method;

public class RCSWorkflow {

	public void validate(Packet packet) throws Exception
	{
		validatePacket(packet);
	}

	public static void validatePacket(Packet packet) throws Exception {
		if(packet.getOriginator().equals("MIA")
				|| packet.getLength() > MAX_LENGTH
				|| !packet.hasValidCheckSum())
		{
			throw new Exception();
		}
	}
	
	private static int MAX_LENGTH;
}
