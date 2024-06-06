public class MaxPriorityThread1 extends Thread {
    public void run() {
        System.out.println("Thread with max priority running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MaxPriorityThread1 t1 = new MaxPriorityThread1();
        MaxPriorityThread1 t2 = new MaxPriorityThread1();
        MaxPriorityThread1 t3 = new MaxPriorityThread1();
        MaxPriorityThread1 t4 = new MaxPriorityThread1();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
