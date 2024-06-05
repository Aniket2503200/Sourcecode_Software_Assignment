class Question2 implements Runnable {
    private String threadName;

    Question2(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question2 myRunnable1 = new Question2("Thread 1");
        Question2 myRunnable2 = new Question2("Thread 2");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
    }
}
