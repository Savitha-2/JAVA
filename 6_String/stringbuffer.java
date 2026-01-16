//for capacity calulation in stringbuffer
//default capacity of stringbuffer is 16
// capacity =16(default) +length of initial string 

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" langauge");
        System.out.println(sb); // HelloWorld
        System.out.println(sb.capacity()); // capacity of the buffer
        System.out.println(sb.length()); // length of the string in the buffer
        sb.insert(5,"programming "); //insert value at index 5
        System.out.println(sb); //prints the modified stringbuffer
        sb.setLength(30);// sets the length of the stringbuffer to 12
        System.out.println(sb); //prints the modified stringbuffer
        

         StringBuffer sb2 = new StringBuffer("abcdefghijklmnoprst"); //exceeds capacity
        //when capacity is exceeded , newcapacity is calaculated 
        //newcapacity=(oldcapacity *2) +2
        sb2.append("uvw");

        System.out.println(sb2.capacity());// new capacity value

    

        /*string buffer to string */
        String str= sb.toString(); // converting stringbuffer to string
        System.out.println(str);


    }   
    
}
