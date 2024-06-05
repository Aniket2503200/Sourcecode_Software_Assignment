class Question4 implements Runnable {
    private String threadName;
    private int sleepTime;

    Question4(String name, int sleepTime) {
        threadName = name;
        this.sleepTime = sleepTime;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question4 myRunnable1 = new Question4("Thread 1", 500); // Sleep for 0.5 seconds
        Question4 myRunnable2 = new Question4("Thread 2", 1000); // Sleep for 1 second

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
    }
}
