package com.amri.legacy.adapt_parameter;

import javax.servlet.http.HttpServletRequest;

public class ServletParameterSource implements ParameterSource {

	private HttpServletRequest request;
	
	public ServletParameterSource(HttpServletRequest request) {
		this.request = request;
	}

	public String[] getParameterValues(String pageStateName) {
		String[] values = request.getParameterValues(pageStateName);
		if(values == null | values.length < 1)
		{
			return null;
		}
		else
			return values;
	}

}
