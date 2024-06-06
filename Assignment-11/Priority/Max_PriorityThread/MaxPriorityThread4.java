public class MaxPriorityThread4 extends Thread {
    public void run() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
            // Simulate CPU-intensive task
            double result = Math.pow(Math.random(), Math.random());
        }
        System.out.println("Thread with max priority completed: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MaxPriorityThread4 t1 = new MaxPriorityThread4();
        MaxPriorityThread4 t2 = new MaxPriorityThread4();
        MaxPriorityThread4 t3 = new MaxPriorityThread4();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
