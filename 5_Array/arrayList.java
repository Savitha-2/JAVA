import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Accessing elements from the ArrayList
        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i)); // prints all the values of each index one by one
        }
        
        // Removing an element from the ArrayList
        fruits.remove("Banana");
        fruits.set(1,"Mango"); // Updating an element at index 1

        //to access elements of particular inde
        System.out.println(fruits.get(1)); //prints Mango

        /*to print the elements of list one by one using loop method */
        System.out.println("After removing Banana:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }




        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(25);
        numbers.add(37);
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));

        }
        //to displat the list in bracket format 
        System.out.println(numbers);
    
    }
}
