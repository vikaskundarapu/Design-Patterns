package structural.bridge.example2.webpage;

import structural.bridge.example2.theme.Theme;

public class Projects extends WebPage {

	public Projects(Theme theme) {
		super(theme);
	}

	@Override
	public void getContent() {
		System.out.print("Projects page is shown using ");
		theme.getTheme();
	}

}
