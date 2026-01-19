class ThisExample {
    int a;
    int b;
    
    void setValues(int a, int b) {
        this.a = a; // 'this' refers to the current object's instance variable
        this.b = b; // 'this' refers to the current object's instance variable
    }
    
    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
public class thisMethod {
    
    public static void main(String[] args) {
        ThisExample obj = new ThisExample();
        obj.setValues(10, 20);
        obj.display();
        
    }
}
