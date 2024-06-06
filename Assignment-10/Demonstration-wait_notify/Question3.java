public class Question3 {
    private static final Object lock = new Object();
    private static boolean pingTurn = true;

    public static void main(String[] args) {
        Thread ping = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    while (!pingTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Ping");
                    pingTurn = false;
                    lock.notify();
                }
            }
        });

        Thread pong = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    while (pingTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Pong");
                    pingTurn = true;
                    lock.notify();
                }
            }
        });

        ping.start();
        pong.start();
    }
}
