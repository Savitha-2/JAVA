class Computer{
   String brand;
   String model;
   int year;

   void displayInfo() {
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Year: " + year);
   }

   public void playMusic(String appName) {
       System.out.println("Playing using " + appName);
   }

   public String getBrand() {
       return brand;
   }
}



public class methods {
   public static void main(String[] args) {
         Computer myComputer = new Computer();
         myComputer.brand = "Dell";
         myComputer.model = "XPS 13";
         myComputer.year = 2021;
    
         myComputer.displayInfo();
         myComputer.playMusic("Spotify");
         myComputer.getBrand();
   } 
}
