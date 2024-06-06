public class NormPriorityExample2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " counting: " + i);
        }
    }

    public static void main(String[] args) {
        NormPriorityExample2 t1 = new NormPriorityExample2();
        NormPriorityExample2 t2 = new NormPriorityExample2();
        NormPriorityExample2 t3 = new NormPriorityExample2();

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
