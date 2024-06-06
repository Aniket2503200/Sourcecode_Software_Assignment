class Question3 extends Thread {
    private String fileName;

    public Question3(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        setName("DownloadThread-" + fileName);
        System.out.println("Thread " + getName() + " is downloading " + fileName);
        // Simulate download with sleep
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread " + getName() + " has finished downloading " + fileName);
    }

    public static void main(String[] args) {
        Question3 t1 = new Question3("file1.zip");
        Question3 t2 = new Question3("file2.zip");

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();
    }
}
