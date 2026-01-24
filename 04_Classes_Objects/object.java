import java.util.Scanner;
class calculator{
    int add(int a, int b){
        
       return  a + b;
    
    }
    
    int sub(int a, int b){
        return a - b;
    }
    
    int mul(int a, int b){
        return a * b;
    }
    
    int div(int a, int b){
        return a / b;
    }
}
public class object {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        calculator calc= new calculator();
       // int result= calc.add(value1,value2);
        //System.out.println(result);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                int result1= calc.add(value1,value2);
                System.out.println(result1);
                break;
            case 2:
                int result2= calc.sub(value1,value2);
                System.out.println(result2);
                break;
           case 3:
                int result3= calc.mul(value1,value2);
                System.out.println(result3);
                break;
            case 4:
                int result4= calc.add(value1,value2);
               System.out.println(result4);   
               break;

            default:
                break;
        }
        sc.close();
    }
    
}
