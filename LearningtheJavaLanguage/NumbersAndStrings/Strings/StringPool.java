public class StringPool {
    public static void main(String[] args) {
        String x = "Java";
        String y = "Java";
        String z = new String("Java"); // Advised to replace with a string literal so it can reuse an object from the String Constant Pool or String Intern Pool

        // Check if they are on the same object in memory:
        System.out.println(x == y);     // true
        System.out.println(x == z);     // false
        z = z.intern();                 // force z into pool
        System.out.println(x == z);     // true now!
    }
}
