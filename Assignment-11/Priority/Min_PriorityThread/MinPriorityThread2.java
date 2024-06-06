public class MinPriorityThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " counting: " + i);
        }
    }

    public static void main(String[] args) {
        MinPriorityThread2 t1 = new MinPriorityThread2();
        MinPriorityThread2 t2 = new MinPriorityThread2();
        MinPriorityThread2 t3 = new MinPriorityThread2();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
