class Question2 extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Question2 t1 = new Question2();
        Question2 t2 = new Question2();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Aniket Sanjay Ugale");

    }
}
