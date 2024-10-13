public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i); // Produce values 1 to 5
                Thread.sleep(500); // Simulate time taken to produce data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
