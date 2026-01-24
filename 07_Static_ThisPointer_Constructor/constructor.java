class Car {
    // Instance variables
    String make;
    String model;
    int year;

    //default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;   // 'this' refers to the current object's make
        this.model = model; // 'this' refers to the current object's model
        this.year = year;   // 'this' refers to the current object's year
    }
    

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Make: " + this.make);
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Year: " + this.year);
    }

}
public class constructor {
    public static void main(String[] args) {
        // Creating an object of the Car class using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);
        
        // Displaying car information
        myCar.displayInfo();
    }

}
