public class ComparingStringsAndPortionsOfStrings {
    public static void main(String[] args) {

        String str1 = "HelloWorld";
        String str2 = "Hello";
        String str3 = "helloworld";
        String str4 = "World";

        // boolean endsWith(String suffix)
        System.out.println("endsWith(\"World\"): " + str1.endsWith("World"));

        // boolean startsWith(String prefix)
        System.out.println("startsWith(\"Hello\"): " + str1.startsWith("Hello"));

        // boolean startsWith(String prefix, int toffset)
        System.out.println("startsWith(\"World\", 5): " + str1.startsWith("World", 5));

        // int compareTo(String anotherString)
        System.out.println("compareTo(\"HelloWorld\"): " + str1.compareTo(str1)); // 0 = strings are exactly equal
        System.out.println("compareTo(\"Hello\"): " + str1.compareTo(str2)); // > 0 = this string is greater than the other
        System.out.println("compareTo(\"HelloWorld\"): " + str2.compareTo(str1)); // < 0 = this string is less than the other

        // int compareToIgnoreCase(String str)
        System.out.println("compareTo(\"helloWorld\"): " + str1.compareTo(str3)); // (ASCII A–Z : 65–90, a–z : 97–122) H = 72, h = 104, difference = 72 - 104 = -32
        System.out.println("compareToIgnoreCase(\"helloworld\"): " + str1.compareToIgnoreCase(str3));

        // boolean equals(Object anObject)
        System.out.println("equals(\"HelloWorld\"): " + str1.equals(str1));
        System.out.println("equals(\"helloworld\"): " + str1.equals(str3));

        // boolean equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase(\"helloworld\"): " + str1.equalsIgnoreCase(str3));

        // boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        System.out.println(
                "regionMatches(true, 5, \"WORLD\", 0, 5): " +
                        str1.regionMatches(true, 5, "WORLD", 0, 5)
        );

        // boolean regionMatches(int toffset, String other, int ooffset, int len)
        System.out.println(
                "regionMatches(5, \"World\", 0, 5): " +
                        str1.regionMatches(5, "WORLD", 0, 5)
        );

        // boolean matches(String regex)
        System.out.println("matches(\"[A-Za-z]+\"): " + str1.matches("[A-Za-z]+"));
    }
}

