public class Question2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread: sending heartbeat signal");
            while (true) {
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                    System.out.println("Heartbeat signal sent");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("user thread: performing user operations");
        }
    }

    public static void main(String[] args) {
        Question2 t1 = new Question2();
        Question2 t2 = new Question2();
        Question2 t3 = new Question2();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
