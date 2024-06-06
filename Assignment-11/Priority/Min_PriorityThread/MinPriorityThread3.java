public class MinPriorityThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000); // Simulate work by sleeping
                System.out.println("Background task " + Thread.currentThread().getName() + " iteration: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MinPriorityThread3 t1 = new MinPriorityThread3();
        MinPriorityThread3 t2 = new MinPriorityThread3();
        MinPriorityThread3 t3 = new MinPriorityThread3();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
