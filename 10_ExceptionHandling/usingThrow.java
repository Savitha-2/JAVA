
public class usingThrow {
    static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
    
    public static void main(String[] args) {
          int a = 5;
          int b = 0;
            try {
                int result = divide(a, b);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }

        
    }
    
}
