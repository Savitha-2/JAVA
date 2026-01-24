class  OuterClass {
    private String outerField = "Outer Field";

    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
public class innerClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstance();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        
    }
    
}
