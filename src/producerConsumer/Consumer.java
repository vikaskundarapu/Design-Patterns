package producerConsumer;

import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

	final Queue<Integer> sharedResource;
	final int SHARED_RESOURCE_SIZE;

	public Consumer(Queue<Integer> sharedResource, int size) {
		this.sharedResource = sharedResource;
		this.SHARED_RESOURCE_SIZE = size;
	}

	public void run() {

		while (true) {
			synchronized (sharedResource) {
				while (sharedResource.isEmpty()) {
					System.out.println("Queue is empty. Waiting for Producer thread to produce");
					try {
						sharedResource.wait();
					} catch (InterruptedException e) {
						Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,
								"InterruptedException has occurred", e);
					}
				}

				System.out.println("Consuming value : " + sharedResource.remove());
				sharedResource.notifyAll();

			}

		}

	}

}
