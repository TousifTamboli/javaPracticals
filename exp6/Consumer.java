public class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume(); // Consume data produced by the producer
                Thread.sleep(700); // Simulate time taken to consume data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
