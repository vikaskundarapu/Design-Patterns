package producerConsumer;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Queue<Integer> sharedResource = new LinkedList<Integer>();
		int SHARED_RESOURCE_SIZE = 8;

		Thread producer = new Thread(new Producer(sharedResource, 7), "Consumer");
		Thread consumer = new Thread(new Consumer(sharedResource, 7), "Producer");

		producer.start();
		consumer.start();

	}

}
