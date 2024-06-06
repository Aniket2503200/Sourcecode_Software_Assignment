public class Question4 {
    private static final Object lock = new Object();
    private static boolean ready = false;

    public static void main(String[] args) {
        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                while (!ready) {
                    try {
                        System.out.println("Waiting for notification...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Received notification!");
            }
        });

        Thread notifier = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Sending notification...");
                ready = true;
                lock.notify();
            }
        });

        waiter.start();
        notifier.start();
    }
}
