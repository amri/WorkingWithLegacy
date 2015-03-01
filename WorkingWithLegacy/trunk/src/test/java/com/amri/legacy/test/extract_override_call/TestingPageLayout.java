package com.amri.legacy.test.extract_override_call;

import java.util.ArrayList;
import java.util.List;

import com.amri.legacy.extract_override_call.PageLayout;
import com.amri.legacy.extract_override_call.StyleTemplate;

public class TestingPageLayout extends PageLayout {

	@Override
	protected List formStyles(StyleTemplate template, int id) {
		
		return new ArrayList();
	}
	
}
