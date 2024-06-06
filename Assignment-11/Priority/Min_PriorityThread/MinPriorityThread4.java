public class MinPriorityThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1500); // Simulate data processing by sleeping
                System.out.println("Data processing task " + Thread.currentThread().getName() + " iteration: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MinPriorityThread4 t1 = new MinPriorityThread4();
        MinPriorityThread4 t2 = new MinPriorityThread4();
        MinPriorityThread4 t3 = new MinPriorityThread4();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
