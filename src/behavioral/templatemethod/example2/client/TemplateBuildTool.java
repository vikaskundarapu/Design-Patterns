package behavioral.templatemethod.example2.client;

import behavioral.templatemethod.example2.AndroidBuilder;
import behavioral.templatemethod.example2.BuilderTool;
import behavioral.templatemethod.example2.IosBuilder;

/**
 * Real world example: Suppose we are getting some house built. The steps for
 * building might look like prepare the base of house, build the walls, add roof
 * and add other floors. The order of these steps could never be changed i.e.
 * you can't build the roof before building the walls etc but each of the steps
 * could be modified for example walls can be made of wood or polyester or
 * stone.
 * 
 * In plain words: Template method defines the skeleton of how a certain
 * algorithm could be performed, but defers the implementation of those steps to
 * the children classes.
 * 
 * Wikipedia says: In software engineering, the template method pattern is a
 * behavioral design pattern that defines the program skeleton of an algorithm
 * in an operation, deferring some steps to subclasses. It lets one redefine
 * certain steps of an algorithm without changing the algorithm's structure.
 *
 * Programmatic Example:Imagine we have a build tool that helps us test, lint,
 * build, generate build reports (i.e. code coverage reports, linting report
 * etc) and deploy our app on the test server.
 * 
 * 
 */
public class TemplateBuildTool {

	public static void main(String[] args) {
		System.out.println("Build andriod code");
		BuilderTool androidCodeBuilder = new AndroidBuilder();
		androidCodeBuilder.build();
		System.out.println("");
		System.out.println("Build andriod code");
		BuilderTool iosCodeBuilder = new IosBuilder();
		iosCodeBuilder.build();
	}

}
