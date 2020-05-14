package structural.bridge.example2.client;

import structural.bridge.example2.theme.Aqua;
import structural.bridge.example2.theme.Dark;
import structural.bridge.example2.theme.Light;
import structural.bridge.example2.webpage.About;
import structural.bridge.example2.webpage.Careers;
import structural.bridge.example2.webpage.Projects;
import structural.bridge.example2.webpage.WebPage;

/**
 * Real world example
 * 
 * Consider you have a website with different pages and you are supposed to
 * allow the user to change the theme. What would you do? Create multiple copies
 * of each of the pages for each of the themes or would you just create separate
 * theme and load them based on the user's preferences? Bridge pattern allows
 * you to do the second. In Plain Words
 * 
 * Bridge pattern is about preferring composition over inheritance.
 * Implementation details are pushed from a hierarchy to another object with a
 * separate hierarchy.
 * 
 * Wikipedia says
 * 
 * The bridge pattern is a design pattern used in software engineering that is
 * meant to "decouple an abstraction from its implementation so that the two can
 * vary independently"
 * 
 */

public class ThemedWebPageClient {

	public static void main(String[] args) {
		WebPage aboutLightThemed = new About(new Light());
		WebPage careerDarkThemed = new Careers(new Dark());
		WebPage projectsAquaThemed = new Projects(new Aqua());
		WebPage aboutDarkThemed = new About(new Dark());

		aboutLightThemed.getContent();
		careerDarkThemed.getContent();
		projectsAquaThemed.getContent();
		aboutDarkThemed.getContent();
	}

}
