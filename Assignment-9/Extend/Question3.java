class Question3 extends Thread {
    private String threadName;
    private int sleepTime;

    Question3(String name, int sleepTime) {
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
        Question3 t1 = new Question3("Thread 1", 500); // Sleep for 0.5 seconds
        Question3 t2 = new Question3("Thread 2", 1000); // Sleep for 1 second
        t1.start();
        t2.start();
    }
}
