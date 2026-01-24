

public class condition {
    public static void main(String[] args) {
        int number = 10;

        // If-Else Statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested If Statement
        int age = 20;
        if (age >= 18) {
            if (age < 65) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }
    }
    
}
