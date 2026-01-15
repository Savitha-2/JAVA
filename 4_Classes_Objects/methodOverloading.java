class addition{
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}



public class methodOverloading {
    public static void main(String[] args) {
        addition obj = new addition();
        System.out.println(obj.add(5, 10)); // Calls the first add method
        System.out.println(obj.add(5, 10, 15)); // Calls the second add method
        System.out.println(obj.add(5.5, 10.5)); // Calls the third add method


        /* for user input
        scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(obj.add(a, b)); // Calls the first add method
        System.out.println(obj.add(a, b, c)); // Calls the second add method    
        System.out.println(obj.add((double)a, (double)b)); // Calls the third add method
        sc.close();
        
        */
    }
}
