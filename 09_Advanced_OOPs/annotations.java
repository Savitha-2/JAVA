@Deprecated
class OldClass {
    void oldMethod() {
        System.out.println("This is a deprecated method.");
    }
}

class NewClass {
    @Override
    public String toString() {
        return "This is the NewClass instance.";
    }
}

public class annotations {
    public static void main(String[] args) {

        OldClass oldObj = new OldClass();
        oldObj.oldMethod();

        NewClass newObj = new NewClass();
        System.out.println(newObj); // calls toString()
    }
}
