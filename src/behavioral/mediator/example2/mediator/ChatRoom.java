package behavioral.mediator.example2.mediator;

import java.time.Instant;
import java.time.LocalTime;

import behavioral.mediator.example2.colleague.User;

public class ChatRoom implements ChatRoomMediator {

	@Override
	public void showMessage(User user, String message) {
		LocalTime now = LocalTime.now();
		String username = user.getName();

		System.out.println(now + " [" + username + "]: " + message);
	}

}
