//string is immutable and not thread safe

public class withoutsynchronization {
    public static void main(String[] args) {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
    
    System.out.println("Final Count: " + c.count);
 }
}
    
