public class stringop {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hellO";
        System.out.println(s1==s2); //compares references, not values
        System.out.println(s1.equals(s2)); //compares values, case-sensitive
        System.out.println(s1.equalsIgnoreCase(s2)); //compares values, case-insensitive
        System.out.println(s1.length()); //prints length of the string
        System.out.println(s1.charAt(1)); //prints character at index 1
        System.out.println(s1.substring(1,4)); //prints substring from index 1 to 3
        System.out.println(s1.toUpperCase()); //converts to uppercase   
        System.out.println(s1.toLowerCase()); //converts to lowercase
        System.out.println(s1.replace('l','p')); //replaces 'l' with 'p'
        System.out.println(s1.contains("lo")); //checks if "lo" is present in
        System.out.println(s1.startsWith("He")); //checks if string starts with "He"
        System.out.println(s1.endsWith("lo")); //checks if string ends with "lo"
        System.out.println(s1.indexOf('l')); //prints index of first occurrence of 'l'
        System.out.println(s1.lastIndexOf('l')); //prints index of last occurrence of 'l'
        System.out.println(s1.trim()); //removes leading and trailing spaces
        System.out.println(s1.concat(" World")); //concatenates " World" to s1

        
    }
    
}
