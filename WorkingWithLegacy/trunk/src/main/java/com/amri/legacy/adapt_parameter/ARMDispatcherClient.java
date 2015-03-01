package com.amri.legacy.adapt_parameter;

import javax.servlet.http.HttpServletRequest;

public class ARMDispatcherClient {
	private static HttpServletRequest servletRequest;

	public static void main(String[] args) {
		ARMDispatcher armDispatcher = new ARMDispatcher();
		ParameterSource request = new ServletParameterSource(servletRequest);
		armDispatcher.populate(request);
		
	}
}
