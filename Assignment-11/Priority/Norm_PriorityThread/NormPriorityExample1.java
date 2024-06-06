public class NormPriorityExample1 extends Thread {
    public void run() {
        System.out.println("Thread with normal priority running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        NormPriorityExample1 t1 = new NormPriorityExample1();
        NormPriorityExample1 t2 = new NormPriorityExample1();
        NormPriorityExample1 t3 = new NormPriorityExample1();

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
