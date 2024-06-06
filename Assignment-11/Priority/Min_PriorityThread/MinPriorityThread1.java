public class MinPriorityThread1 extends Thread {
    public void run() {
        System.out.println("Thread with min priority running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MinPriorityThread1 t1 = new MinPriorityThread1();
        MinPriorityThread1 t2 = new MinPriorityThread1();
        MinPriorityThread1 t3 = new MinPriorityThread1();
        MinPriorityThread1 t4 = new MinPriorityThread1();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
