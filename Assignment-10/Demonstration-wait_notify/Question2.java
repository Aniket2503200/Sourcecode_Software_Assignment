class Question2 {
    private static final Object lock = new Object();
    private static boolean produced = false;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Producer: Producing...");
                produced = true;
                lock.notify();
                System.out.println("Producer: Notified.");
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                while (!produced) {
                    try {
                        System.out.println("Consumer: Waiting...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer: Consumed.");
            }
        });

        consumer.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start();
    }
}
