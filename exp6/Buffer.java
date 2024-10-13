public class Buffer {
    private int data;
    private boolean isProduced = false; // Flag to track if data is produced

    // Synchronized method for producing data
    public synchronized void produce(int value) throws InterruptedException {
        while (isProduced) {
            wait(); // Wait if data is already produced and not consumed
        }
        this.data = value;
        System.out.println("Produced: " + value);
        isProduced = true;
        notify(); // Notify the consumer to consume the data
    }

    // Synchronized method for consuming data
    public synchronized int consume() throws InterruptedException {
        while (!isProduced) {
            wait(); // Wait if there's no data produced yet
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify(); // Notify the producer to produce more data
        return data;
    }
}
