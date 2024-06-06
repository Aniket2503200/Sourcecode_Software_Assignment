public class NormPriorityExample4 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(3000); // Simulate work by sleeping
                System.out.println("Background task " + Thread.currentThread().getName() + " iteration: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NormPriorityExample4 t1 = new NormPriorityExample4();
        NormPriorityExample4 t2 = new NormPriorityExample4();
        NormPriorityExample4 t3 = new NormPriorityExample4();

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
