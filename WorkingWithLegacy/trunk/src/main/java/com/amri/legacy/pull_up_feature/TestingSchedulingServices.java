package com.amri.legacy.pull_up_feature;

public class TestingSchedulingServices extends SchedulingServices {
	public TestingSchedulingServices() {}
	
	public void addItem(ScheduleItem item)
	{
		items.add(item);
	}
}
