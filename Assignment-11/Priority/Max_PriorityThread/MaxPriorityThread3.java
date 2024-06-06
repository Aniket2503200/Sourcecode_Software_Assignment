public class MaxPriorityThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000); // Simulate work by sleeping
                System.out.println("High-priority task " + Thread.currentThread().getName() + " iteration: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MaxPriorityThread3 t1 = new MaxPriorityThread3();
        MaxPriorityThread3 t2 = new MaxPriorityThread3();
        MaxPriorityThread3 t3 = new MaxPriorityThread3();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
