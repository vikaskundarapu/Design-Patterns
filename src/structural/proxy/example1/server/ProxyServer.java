package structural.proxy.example1.server;

/**
 * Actual server is protected and is relatively safe from attacks
 */
public class ProxyServer implements Server {

	private static final String INVALID_SESSION = "Invalid Session";
	/* Reference to actual server */
	private final ActualServer actualServer;
	private boolean isSessionActive;

	public ProxyServer() {
		super();
		this.actualServer = new ActualServer();
		this.isSessionActive = false;
	}

	@Override
	public void authenticate() {
		/* Get the user credentials and login */
		actualServer.authenticate();
		/* Track the session */
		isSessionActive = true;
	}

	@Override
	public void get() {
		if (isSessionActive) {
			actualServer.get();
		} else {
			System.out.println(INVALID_SESSION);
		}
	}

	@Override
	public void post() {
		if (isSessionActive) {
			actualServer.post();
		} else {
			System.out.println(INVALID_SESSION);
		}
	}

	@Override
	public void put() {
		if (isSessionActive) {
			actualServer.put();
		} else {
			System.out.println(INVALID_SESSION);
		}
	}

	@Override
	public void delete() {
		if (isSessionActive) {
			actualServer.delete();
		} else {
			System.out.println(INVALID_SESSION);
		}

	}

	@Override
	public void logout() {
		actualServer.logout();

		/* Deactivate the session */
		isSessionActive = false;
	}

}
