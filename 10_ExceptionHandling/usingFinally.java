

public class usingFinally {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]=new int[5];
        try {
           j=18/i; // This will cause ArithmeticException
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        //catch block to handle ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Exception caught: " + e.getMessage());
        }
        //catch block to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Exception caught: " + e.getMessage());
        }
        //finally block will always execute
        finally {
            System.out.println("This block is always executed.");
        }
    }
    
}
