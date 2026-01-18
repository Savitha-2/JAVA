class Human{
    private String name;
    private int age;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        if(age >= 0) { // Simple validation
            this.age = age;
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human person = new Human();
        
        // Setting values using setters
        person.setName("John Doe");
        person.setAge(30);
        
        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
    }
    
}
