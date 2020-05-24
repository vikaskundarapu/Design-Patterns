package behavioral.mediator.example2.mediator;

import behavioral.mediator.example2.colleague.User;

public interface ChatRoomMediator {

	public void showMessage(User user, String message);
}
