package com.amri.legacy.test.pull_up_feature;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amri.legacy.pull_up_feature.ScheduleItem;
import com.amri.legacy.pull_up_feature.TestingSchedulingServices;

public class SchedulingServicesTest {

	@Test
	public void test() {
		TestingSchedulingServices testingSchedulingServices = new TestingSchedulingServices();
		testingSchedulingServices.addItem(new ScheduleItem("a", 10, 20, ScheduleItem.BASIC));
		assertEquals(2, testingSchedulingServices.getDeadTime());
	}

}
