package behavioral.mediator.example2.colleague;

import behavioral.mediator.example2.mediator.ChatRoomMediator;

public class User {

	private String name;
	private ChatRoomMediator chatRoomMediator;

	private User() {
		super();
	}

	public User(String name, ChatRoomMediator chatRoomMediator) {
		super();
		this.name = name;
		this.chatRoomMediator = chatRoomMediator;
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		this.chatRoomMediator.showMessage(this, message);
	}

}
