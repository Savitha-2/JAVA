public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" language");
        System.out.println(sb); // HelloWorld
        System.out.println(sb.capacity()); // capacity of the builder
        System.out.println(sb.length()); // length of the string in the builder
        sb.insert(5,"programming "); //insert value at index 5
        System.out.println(sb); //prints the modified stringbuilder
        sb.setLength(30);// sets the length of the stringbuilder to 30
        System.out.println(sb); //prints the modified stringbuilder
        

         StringBuilder sb2 = new StringBuilder("abcdefghijklmnoprst"); //exceeds capacity
        //when capacity is exceeded , newcapacity is calaculated 
        //newcapacity=(oldcapacity *2) +2
        sb2.append("uvw");

        System.out.println(sb2.capacity());// new capacity value

    

        /*string builder to string */
        String str= sb.toString(); // converting stringbuilder to string
        System.out.println(str);
    }
    
}
