import java.util.ArrayList;
import java.util.Scanner;
public class arraylists {
   public static void main(String[] args) {
    ArrayList<String>foods =new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Number of foods you wnat to order");
    int numOfFoods=scanner.nextInt();
    scanner.nextLine(); // Consume the newline character
    for(int i=0;i<numOfFoods;i++){
        System.out.println("Enter the food item " + (i+1));
        String dish=scanner.nextLine();
        foods.add(dish);
    }
    System.out.println(foods);
    scanner.close();
   } 
}
