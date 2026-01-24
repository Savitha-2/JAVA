@FunctionalInterface
interface A {
    int a=10;
   // void display(int a);
    //void show();
    int add (int x, int y);

}

public class lambdaExpression {
    public static void main(String[] args) {
        // Lambda expression to implement the show method
      //  A obj = () -> System.out.println("Functional Interface Example using Lambda");
      //  obj.show();

      //lambda expression must have one abstract method , you can comment another method or object and run the code

        // A obj1= (int a) -> System.out.println("Value of a is: " + a);
        // obj1.display(20);

        A obj2 = (x, y) -> x + y;
        
        int result = obj2.add(5, 10);
        System.out.println("Sum: " + result);
    }
    
}
