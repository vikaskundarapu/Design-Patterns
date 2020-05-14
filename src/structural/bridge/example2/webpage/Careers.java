package structural.bridge.example2.webpage;

import structural.bridge.example2.theme.Theme;

public class Careers extends WebPage {

	public Careers(Theme theme) {
		super(theme);
	}

	@Override
	public void getContent() {
		System.out.print("Careers page is shown using ");
		theme.getTheme();
	}

}
