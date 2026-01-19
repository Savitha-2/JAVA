class calculator{
    int add(int a, int b){
        return a+b;
    }
}
class scientificCalculator extends calculator{
    //method overriding
    @Override //optional  , does not make any difference to code
    int add(int a, int b){
        System.out.println("Addition of two numbers:");
        return a+b+2;
    }
}
public class methodOverriding {
    public static void main(String[] args) {
       scientificCalculator  sc = new scientificCalculator();
       //calls scientificCalculator's add method because object type is scientificCalculator 
        int result = sc.add(10, 20);
        System.out.println(result);

       
    }
}
