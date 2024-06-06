class Question4 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has finished.");
    }

    public static void main(String[] args) {
        Question4 t1 = new Question4();
        Question4 t2 = new Question4();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both threads have finished execution in sequence.");
    }
}
