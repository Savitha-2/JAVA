class Animal {
    String name = "Animal";
    public Animal(){
        System.out.println("Animal Constructor Called");
    }
    public Animal(String type){
        System.out.println("Animal Type: " + type);
    }

   
   
}
class Dog extends Animal {
    String name = "Dog";
    public Dog(){
        super(); // Calling parent class constructor with parameter
        System.out.println("Dog Constructor Called");
    }
    public Dog(String name){
        super( "Mammal"); // Calling parent class default constructor
        System.out.println("Dog Breed: " + name);
    }
}
public class superMethod {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Dog obj2 = new Dog("Bulldog");
        
        
    }
    
}
