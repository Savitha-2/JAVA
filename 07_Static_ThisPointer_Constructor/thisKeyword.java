class Person {
    String name;
    int age;

    // Constructor using 'this' keyword to differentiate between instance variables and parameters
    public Person(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name); // Using 'this' to refer to instance variable
        System.out.println("Age: " + this.age);   // Using 'this' to refer to instance variable
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayInfo();
        
    }
}
