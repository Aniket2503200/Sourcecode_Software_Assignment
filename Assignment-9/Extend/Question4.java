class Question4 extends Thread {
    private String threadName;
    private String[] words;

    Question4(String name, String[] words) {
        threadName = name;
        this.words = words;
    }

    public void run() {
        for (String word : words) {
            System.out.println(threadName + " running: " + word);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        String[] words1 = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
        String[] words2 = { "Ford", "GMC", "Honda", "Isuzu", "Jeep" };

        Question4 thread1 = new Question4("Thread 1", words1);
        Question4 thread2 = new Question4("Thread 2", words2);

        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        thread2.start();
    }
}
