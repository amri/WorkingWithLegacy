package com.amri.legacy.test.extract_override_call;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amri.legacy.extract_override_call.PageLayout;

public class PageLayoutTest {

	@Test
	public void test() {
		PageLayout pageLayout = new TestingPageLayout();
		pageLayout.rebindStyles();
	}

}
