import java.util.HashMap;
import java.util.Map;

class SimpleProducerConsumer {
    public static void main(String[] args) {
        // Shared buffer
        Buffer buffer = new Buffer();

        // Creating and starting the producer and consumer threads
        new Thread(new Producer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}

class Buffer {
    private int data;
    private boolean isEmpty = true;

    // Synchronized method for producing data
    public synchronized void produce(int value) {
        while (!isEmpty) {  // Wait if the buffer is not empty
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify();  // Notify the consumer that data is available
    }

    // Synchronized method for consuming data
    public synchronized int consume() {
        while (isEmpty) {  // Wait if the buffer is empty
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isEmpty = true;
        System.out.println("Consumed: " + data);
        notify();  // Notify the producer that space is available
        return data;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(100);  // Simulating time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(200);  // Simulating time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

