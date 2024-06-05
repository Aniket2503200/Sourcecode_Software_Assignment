class Question2 extends Thread {
    private String message;

    Question2(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + ": message " + i);
            try {
                Thread.sleep(700); // Sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question2 t1 = new Question2("Hello from Thread 1");
        Question2 t2 = new Question2("Hello from Thread 2");
        t1.start();
        t2.start();
    }
}
