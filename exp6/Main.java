public class Main {
    public static void main(String[] args) {
        // Shared buffer between Producer and Consumer
        Buffer buffer = new Buffer();

        // Create and start Producer thread using Runnable interface
        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.start();

        // Create and start Consumer thread by extending Thread class
        Consumer consumerThread = new Consumer(buffer);
        consumerThread.start();
    }
}
