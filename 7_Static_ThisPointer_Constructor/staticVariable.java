class Student {
    String name;
    int rollNumber;
    static String schoolName = "ABC High School"; // Static variable

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", School: " + schoolName);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Charlie", 103);

        s1.display();
        s2.display();
        s3.display();
    }
    
}
