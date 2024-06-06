public class Question3 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread: sending notifications");
            while (true) {
                try {
                    Thread.sleep(3000); // Sleep for 3 seconds
                    System.out.println("Sending notification...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("user thread: performing user operations");
        }
    }

    public static void main(String[] args) {
        Question3 t1 = new Question3();
        Question3 t2 = new Question3();
        Question3 t3 = new Question3();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
