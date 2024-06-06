public class MaxPriorityThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " counting: " + i);
        }
    }

    public static void main(String[] args) {
        MaxPriorityThread2 t1 = new MaxPriorityThread2();
        MaxPriorityThread2 t2 = new MaxPriorityThread2();
        MaxPriorityThread2 t3 = new MaxPriorityThread2();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
