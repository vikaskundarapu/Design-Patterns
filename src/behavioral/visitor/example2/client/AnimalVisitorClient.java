package behavioral.visitor.example2.client;

import behavioral.visitor.example2.visitable.AnimalVisitable;
import behavioral.visitor.example2.visitable.Dolphin;
import behavioral.visitor.example2.visitable.Lion;
import behavioral.visitor.example2.visitable.Monkey;
import behavioral.visitor.example2.visitor.AnimalVisitor;
import behavioral.visitor.example2.visitor.Jump;
import behavioral.visitor.example2.visitor.Speak;

/**
 * Real world example: Consider someone visiting Dubai. They just need a way
 * (i.e. visa) to enter Dubai. After arrival, they can come and visit any place
 * in Dubai on their own without having to ask for permission or to do some leg
 * work in order to visit any place here; just let them know of a place and they
 * can visit it. Visitor pattern lets you do just that, it helps you add places
 * to visit so that they can visit as much as they can without having to do any
 * legwork.
 * 
 * In plain words: Visitor pattern lets you add further operations to objects
 * without having to modify them.
 * 
 * Wikipedia says: In object-oriented programming and software engineering, the
 * visitor design pattern is a way of separating an algorithm from an object
 * structure on which it operates. A practical result of this separation is the
 * ability to add new operations to existing object structures without modifying
 * those structures. It is one way to follow the open/closed principle.
 * 
 * Programmatic example: Let's take an example of a zoo simulation where we have
 * several different kinds of animals and we have to make them Sound. Let's
 * translate this using visitor pattern. First we will give only make noise
 * action for the visitables. Now later, if we want add some make actions like
 * say jump, all we have to do is add a new Jump class extending AnimalVisitor
 * interface.
 * 
 */

public class AnimalVisitorClient {

	public static void main(String[] args) {

		/* Only to demonstrate make noise action */
		AnimalVisitable monkey = new Monkey();
		AnimalVisitable lion = new Lion();
		AnimalVisitable dolphin = new Dolphin();

		AnimalVisitor animalVisitor = new Speak();

		monkey.accept(animalVisitor);
		lion.accept(animalVisitor);
		dolphin.accept(animalVisitor);

		System.out.println("-------------------------------------------------------------------------------------");

		/* Later we have added a Jump action to all visitables */

		AnimalVisitor jumpVisitor = new Jump();
		monkey.accept(jumpVisitor);
		lion.accept(jumpVisitor);
		dolphin.accept(jumpVisitor);
	}

}
