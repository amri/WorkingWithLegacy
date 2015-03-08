package com.amri.legacy.pull_up_feature;


//MAIN
public class Scheduler extends SchedulingServices {
	
	public void updateScheduleItem(ScheduleItem item) throws SchedulingException
	{
		try {
			validate(item);
		}
		catch(ConflictException e)
		{
			throw new SchedulingException(e);
		}
	}

	private void validate(ScheduleItem item) throws ConflictException {
		
	}
}
