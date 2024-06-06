class Question4 implements Runnable {
    public void run() {
        Thread.currentThread().setName("Runnable-Thread");
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Question4());
        t1.start();
    }
}
