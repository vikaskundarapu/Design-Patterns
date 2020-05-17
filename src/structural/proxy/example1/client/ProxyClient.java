package structural.proxy.example1.client;

import structural.proxy.example1.server.ProxyServer;
import structural.proxy.example1.server.Server;

/**
 * Let us see the example of a Proxy Server. A proxy server, also known as a
 * "proxy" or "application-level gateway", is a computer that acts as a gateway
 * between a local network (e.g., all the computers at one company or in one
 * building) and a larger-scale network such as the Internet. Proxy servers
 * provide increased performance and security. A proxy server can act as an
 * intermediary between the user's computer and the Internet to prevent attacks
 * and unexpected access.
 * 
 * A proxy server will behave just like the real server and implements the same
 * interface.
 * 
 */
public class ProxyClient {

	public static void main(String[] args) {

		/* Client can access only the proxy server */
		Server server = new ProxyServer();

		/* Client works with the same interface */
		server.authenticate();
		server.get();
		server.post();
		server.put();
		server.delete();
		server.logout();
	}
}
