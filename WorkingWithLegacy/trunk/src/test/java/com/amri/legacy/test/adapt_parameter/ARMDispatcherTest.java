package com.amri.legacy.test.adapt_parameter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amri.legacy.adapt_parameter.ARMDispatcher;
import com.amri.legacy.adapt_parameter.ParameterSource;

public class ARMDispatcherTest {

	@Test
	public void test() {
		ARMDispatcher armDispatcher = new ARMDispatcher();
		ParameterSource request = new FakeParameterSource();
		armDispatcher.populate(request);
	}
}
