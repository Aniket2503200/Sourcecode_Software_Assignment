class Question2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Question2());
        t1.start();
        try {
            t1.join(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread waited for 1 second.");
    }
}
