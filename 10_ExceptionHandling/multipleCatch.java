

public class multipleCatch {
    public static void main(String[] args) {
        // Demonstrating multiple catch blocks
        try {
            int data = 50 / 0;
            System.out.println("Result: " + data);
        } 
        //ArithmeticException shows when division by zero occurs
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Exception caught: " + e.getMessage());
        } 
        //ArrayIndexOutOfBoundsException shows when array index is invalid
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Exception caught: " + e.getMessage());
        } 
        //Generic Exception catch block
        catch (Exception e) {
            System.out.println("Other exception caught: " + e.getMessage());
        }
    }
}