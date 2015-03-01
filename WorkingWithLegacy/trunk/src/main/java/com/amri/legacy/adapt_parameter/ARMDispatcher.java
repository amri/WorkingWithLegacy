package com.amri.legacy.adapt_parameter;

import javax.servlet.http.HttpServletRequest;

public class ARMDispatcher {

	public void populate(ParameterSource request)
	{
		String[] values = request.getParameterValues(pageStateName);
		if(values != null && values.length > 0)
		{
			marketBindings.put(pageStateName + getDateStamp(), values[0]);
		}
	}

	private String pageStateName;
	private MarketBinding marketBindings;
	public class MarketBinding {
		public void put(String string, String string2) {
		}
	}
	private String getDateStamp() {
		return null;
	}
}

