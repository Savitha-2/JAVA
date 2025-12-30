public class typeConversion {
 public static void main(String[] args) {

        byte b=127;
        int a=b;
        System.out.println(a);

        
        // Implicit Conversion (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic conversion from int to double

        System.out.println("Integer value: " + myInt);      // Outputs 9
        System.out.println("Converted to double: " + myDouble); // Outputs 9.0

        // Explicit Conversion (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual conversion from double to int

        System.out.println("Double value: " + myDouble2);   // Outputs 9.78
        System.out.println("Converted to integer: " + myInt2); // Outputs 9
    }


    
}
