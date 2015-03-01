package com.amri.legacy.extract_override_call;

import java.util.List;

public class PageLayout {

	protected void rebindStyles() {
		styles = StyleMaster.formStyles(template, id);
	}

	private List styles;
	private StyleTemplate template;
	private int id;
}
