public class tryCatch {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Exception caught: " + e.getMessage());
        } 
    
}
}
