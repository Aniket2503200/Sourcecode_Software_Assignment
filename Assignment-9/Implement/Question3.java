class Question3 implements Runnable {
    private String threadName;

    Question3(String name) {
        threadName = name;
    }

    public void run() {
        String[] messages = { "One", "Two", "Three", "Four", "Five" };
        for (String message : messages) {
            System.out.println(threadName + " running: " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question3 myRunnable1 = new Question3("Thread 1");
        Question3 myRunnable2 = new Question3("Thread 2");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        thread2.start();
    }
}
