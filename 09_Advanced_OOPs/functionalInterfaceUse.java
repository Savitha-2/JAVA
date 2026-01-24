@FunctionalInterface
interface  A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Functional Interface Example");
    }
}

public class functionalInterfaceUse {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
    }

    //can be done without creating class B as well using lambda expression
    /*
    public static void main(String[] args) {
        A obj = () -> System.out.println("Functional Interface Example using Lambda");
        obj.show();
    }
    */
    
}
