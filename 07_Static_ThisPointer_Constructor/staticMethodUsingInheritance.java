class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    // Inherits static method display() from Parent
    static void show() {
        System.out.println("Static method in Child class");
    }
    static void display() {
        System.out.println("Static method in Child class ");
    }
} 


public class staticMethodUsingInheritance {
    public static void main(String[] args) {
        // Calling static method from Parent class
        Parent.display();

        // Calling static method from Child class
        Child.show();
        // Calling inherited static method from Parent class using Child class
       
        // Note: Static methods are not truly overridden; this is method hiding.
         Child.display();

        
    }
    
}
