package com.amri.legacy.extract_override_call;

import java.util.List;

public class PageLayout {

	public void rebindStyles() {
		styles = formStyles(template, id);
	}
	
	protected List formStyles(StyleTemplate template, int id) {
		return StyleMaster.formStyles(template, id);
	}

	private List styles;
	private StyleTemplate template;
	private int id;
}
