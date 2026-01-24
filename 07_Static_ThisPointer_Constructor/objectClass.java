class Laptop{
    String name;
    int price;
    public String toString(){
        return "Laptop Name: "+name+" Price: "+price;
    }

    public boolean equals(Object obj){
        if(this == obj) return true; //same memory address
        if(obj == null || getClass() != obj.getClass()) return false; //null or different class
        Laptop laptop = (Laptop) obj; //type casting
        return this.name.equals(laptop.name) && this.price == laptop.price; //compare values
       

    }
}

public class objectClass {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.name="Dell";
        obj.price=50000;
        System.out.println(obj);  //it refers to object class which prints class name @ memory address
        
        //we can override toString() method to print object details
        // if we create different object with same values  then comparing the values will return false
        Laptop obj2=new Laptop();
        obj2.name="Dell";
        obj2.price=50000;   
        boolean result = obj.equals(obj2);
        System.out.println(result); 
        
        //false because it compares memory address not values
        //value of obj and obj2 are same but memory address is different
        //to compare values we need to override equals() method in the Laptop class
    }
    
}
