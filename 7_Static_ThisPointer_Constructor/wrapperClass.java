public class wrapperClass {
    public static void main(String[] args) {
        int num=7;
        Integer num1 =num;  //autoboxing

        int num2=num1; //auto-unboxing
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer: " + num1);
        System.out.println("Unboxed int: " + num2);

        String str="123";
        int num3=Integer.parseInt(str); //String to int

        System.out.println("String: " + str);
        System.out.println("Parsed int: " + num3);  
    }
    
}
