//package 9_Advanced_OOPs;
class ThreadDemo  {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class anonymousClass {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo() {
            public void run() {
                System.out.println("Anonymous Thread is running...");
            }
        };
        t.run();
        
        
    }
    
}
