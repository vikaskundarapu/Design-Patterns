package structural.bridge.example2.webpage;

import structural.bridge.example2.theme.Theme;

public abstract class WebPage {
	protected Theme theme;

	protected WebPage(Theme theme) {
		this.theme = theme;
	}

	public abstract void getContent();
}
