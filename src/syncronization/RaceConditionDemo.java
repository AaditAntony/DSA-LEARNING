package syncronization;

class Counter {
    int count =0;
    public synchronized void increment(){
        count++;
    }
}
public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();
        // this is the first thread
        Thread t1= new Thread(()->{
            for(int i=0;i<=1_000_000;i++){
                count.increment();
            }
        });
        // this is the second thread
        Thread t2= new Thread(()->{
            for(int i=0;i<1_000_000;i++){
                count.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count " +count.count);
    }
}

// the purpose of the syncronization is to allow only one thread to enter the method only after finishing execution
// that thread only the other thread is allowed to enter the method
// use of the bock syncronization
//class Counter {
//    int count = 0;
//
//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }
//}