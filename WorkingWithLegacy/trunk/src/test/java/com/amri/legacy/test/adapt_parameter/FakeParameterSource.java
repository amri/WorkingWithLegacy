package com.amri.legacy.test.adapt_parameter;

import com.amri.legacy.adapt_parameter.ParameterSource;

public class FakeParameterSource implements ParameterSource {
	public String fakeValue;
	public String[] getParameterValues(String pageStateName) {
		String[] fakeValues = new String[1];
		fakeValues[0] = fakeValue;
		return fakeValues;
	}

}
