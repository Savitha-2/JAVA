public class stringBasic {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        // Concatenation
        String str3=str1+" "+str2;
        System.out.println("Concatenated String: "+str3);

        // Length
        System.out.println("Length of str3: "+str3.length());

        // Character at index
        System.out.println("Character at index 4: "+str3.charAt(4));

        // Substring
        String substr=str3.substring(6);
        System.out.println("Substring from index 6: "+substr);

        // Replace
        String replacedStr=str3.replace("World","Java");
        System.out.println("After Replacement: "+replacedStr);

        // To Upper Case
        System.out.println("Upper Case: "+str3.toUpperCase());

        // To Lower Case
        System.out.println("Lower Case: "+str3.toLowerCase());
        //hashcode
        System.out.println("Hashcode of str3: "+str3.hashCode());
        //charAt
        for(int i=0;i<str3.length();i++){
            System.out.println("Character at index "+i+": "+str3.charAt(i));
        }
    }
}
