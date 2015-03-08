package com.amri.legacy.pull_up_feature;

import java.util.Iterator;
import java.util.List;

public class SchedulingServices {

	protected List items;

	public int getDeadTime() {
		int result = 0;
		for(Iterator<ScheduleItem> it = items.iterator(); it.hasNext();)
		{
			ScheduleItem item = it.next();
			if(item.getType() != ScheduleItem.TRANSIENT && notShared(item))
			{
				result += item.getSetupTime() + clockTime();
			}
			if(item.getType() != ScheduleItem.TRANSIENT)
			{
				result += item.finishingTime();
			}
			else {
				result += getStandardFinish(item);
			}
		}
		
		return result;
	}

	private int clockTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getStandardFinish(ScheduleItem item) {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean notShared(ScheduleItem item) {
		// TODO Auto-generated method stub
		return false;
	}

}
