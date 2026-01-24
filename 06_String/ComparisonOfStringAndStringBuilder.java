public class ComparisonOfStringAndStringBuilder {

    public static void main(String[] args) {

        // ---------- String Example ----------
        String str = "Hello";
        str = str + " World"; // creates a NEW String object
        System.out.println(str); // Hello World


        // ---------- StringBuilder Example ----------
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // modifies the SAME object
        System.out.println(sb); // Hello World


        // ---------- StringBuilder in loop ----------
        // Only ONE StringBuilder object is used.
        // No new objects are created in each iteration.
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }

        System.out.println(sb); // Hello World0123456789
    }
}
