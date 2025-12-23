public class ConcatenatingStrings {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = " World!";
        System.out.println(string1.concat(string2));

        // Concat with String Literals
        String rumple = "My name is ".concat("Rumple");
        System.out.println(rumple);

        // Common concatenation
        System.out.println("Hello," + " world" + "!");

        // Java does not permit literal strings to span lines in source files, so you must use the + concatenation operator
        // at the end of each line in a multi-line string. For example:
        String quote =
            "Java spanning multiple lines " +
            "with concatenation!";
        System.out.println(quote);

        // printf() and format() methods
        // format() method in java.lang.String class returns a String object rather than a PrintStream object

    }
}
