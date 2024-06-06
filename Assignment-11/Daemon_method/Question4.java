public class Question4 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread: monitoring database connection");
            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Checking database connection...");
                    if (!isConnected()) {
                        System.out.println("Connection lost. Reconnecting...");
                        reconnect();
                    } else {
                        System.out.println("Connection is healthy.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("User thread: performing user tasks");
        }
    }

    private boolean isConnected() {
        return Math.random() > 0.2;
    }

    private void reconnect() {
        System.out.println("Reconnected to database.");
    }

    public static void main(String[] args) {
        Question4 t1 = new Question4();
        Question4 t2 = new Question4();
        Question4 t3 = new Question4();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
