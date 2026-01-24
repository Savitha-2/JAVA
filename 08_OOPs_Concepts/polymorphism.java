class polymorphismExample {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism in Java");
        polymorphismExample obj = new polymorphismExample();
        obj.add(10, 20); // Calls the method with integer parameters    
        obj.add(10.5, 20.5); // Calls the method with double parameters

    }
    
}
