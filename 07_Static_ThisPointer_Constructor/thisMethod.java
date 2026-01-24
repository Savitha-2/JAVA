class ThisExample {
    int a;
    int b;
    
   public ThisExample(){
       System.out.println("ThisExample Constructor Called");
   }
   public ThisExample(int a, int b){
       this.a = a; // Using 'this' to refer to instance variable
       this.b = b; // Using 'this' to refer to instance variable
   }
}
class AnotherExample extends ThisExample {
    int x;
    int y;
    
    public  AnotherExample(){
        System.out.println("Default constructor of AnotherExample"); 
    }
    public  AnotherExample(int x, int y){
        this(); // Calling the default constructor of the same class
        System.out.println("AnotherExample Constructor Called" +x +"," +y);
    }

}
public class thisMethod {
    
    public static void main(String[] args) {
        AnotherExample obj = new AnotherExample(10, 20);
        
    }
}
