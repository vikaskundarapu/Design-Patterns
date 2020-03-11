package producerConsumer;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {

	final Queue<Integer> sharedResource;
	final int SHARED_RESOURCE_SIZE;

	public Producer(Queue<Integer> sharedResource, int size) {
		this.sharedResource = sharedResource;
		this.SHARED_RESOURCE_SIZE = size;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (sharedResource) {
				while (sharedResource.size() == SHARED_RESOURCE_SIZE) {
					System.out.println("Queue is full.Producer thread is waiting Consumer thread to consume");
					try {
						sharedResource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						Logger.getLogger(Producer.class.getName()).log(Level.WARNING, "InterupedException haa occured",
								e);
					}
				}

				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				sharedResource.add(i);
				sharedResource.notifyAll();

			}

		}

	}

}
