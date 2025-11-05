package thread;

class MyThread extends Thread {
    private String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start(); // starts a new thread
        t2.start(); // starts another new thread
    }
}
