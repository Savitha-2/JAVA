class StaticExample {
    static int staticVar = 10;

    static void staticMethod() {
        System.out.println("Static method called. Static variable value: " + staticVar);
    }
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double x, double y) {
        return x +y;
    }
}

public class staticMethodOverloading {
    public static void main(String[] args) {
        StaticExample.staticMethod();
        int intSum = StaticExample.add(5, 10);
        double doubleSum = StaticExample.add(5.5, 10.5);

        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
        
    }
    
}
