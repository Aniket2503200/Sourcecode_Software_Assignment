class Question1 implements Runnable {
    private String name;

    public Question1(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new Question1("Runnable-Worker-1"));
        Thread t2 = new Thread(new Question1("Runnable-Worker-2"));

        System.out.println("Name of t1 before start: " + t1.getName());
        System.out.println("Name of t2 before start: " + t2.getName());

        t1.start();
        t2.start();
    }
}
