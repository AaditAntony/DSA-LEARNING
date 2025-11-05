package thread;

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

 class Cort{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));

        t1.start();
        t2.start();
    }
}
