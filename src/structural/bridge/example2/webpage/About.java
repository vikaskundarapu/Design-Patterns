package structural.bridge.example2.webpage;

import structural.bridge.example2.theme.Theme;

public class About extends WebPage {

	public About(Theme theme) {
		super(theme);
	}

	@Override
	public void getContent() {
		System.out.print("About page is shown using ");
		theme.getTheme();
	}

}
