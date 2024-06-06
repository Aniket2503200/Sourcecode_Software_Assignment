public class Question1 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread: performing background cleanup");
        } else {
            System.out.println("user thread: performing user tasks");
        }
    }

    public static void main(String[] args) {
        Question1 t1 = new Question1();
        Question1 t2 = new Question1();
        Question1 t3 = new Question1();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
