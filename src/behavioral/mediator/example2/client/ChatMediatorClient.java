package behavioral.mediator.example2.client;

import java.time.LocalTime;

import behavioral.mediator.example2.colleague.User;
import behavioral.mediator.example2.mediator.ChatRoom;
import behavioral.mediator.example2.mediator.ChatRoomMediator;

/**
 * Real world example: A general example would be when you talk to someone on
 * your mobile phone, there is a network provider sitting between you and them
 * and your conversation goes through it instead of being directly sent. In this
 * case network provider is mediator.
 * 
 * In plain words: Mediator pattern adds a third party object (called mediator)
 * to control the interaction between two objects (called colleagues). It helps
 * reduce the coupling between the classes communicating with each other.
 * Because now they don't need to have the knowledge of each other's
 * implementation.
 * 
 * Wikipedia says: In software engineering, the mediator pattern defines an
 * object that encapsulates how a set of objects interact. This pattern is
 * considered to be a behavioral pattern due to the way it can alter the
 * program's running behavior.
 * 
 * Programmatic Example: Here is the simplest example of a chat room (i.e.
 * mediator) with users (i.e. colleagues) sending messages to each other.
 *
 */
public class ChatMediatorClient {

	public static void main(String[] args) {
		ChatRoomMediator chatRoomMediator = new ChatRoom();

		User dwight = new User("Dwight Schrute", chatRoomMediator);
		User michael = new User("Michael Scott", chatRoomMediator);

		dwight.sendMessage("I did your laundry!");
		michael.sendMessage("That's what she said!");
	}

}
