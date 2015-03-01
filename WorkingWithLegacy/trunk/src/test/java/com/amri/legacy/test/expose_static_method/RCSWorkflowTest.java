package com.amri.legacy.test.expose_static_method;

import org.junit.Test;

import com.amri.legacy.expose_static_method.Packet;
import com.amri.legacy.expose_static_method.RCSWorkflow;

public class RCSWorkflowTest {

	@Test
	public void test() throws Exception {
		RCSWorkflow rcsWorkflow = new RCSWorkflow();
		Packet packet = new Packet();
		rcsWorkflow.validate(packet);
		RCSWorkflow.validatePacket(packet);
		
	}

}
