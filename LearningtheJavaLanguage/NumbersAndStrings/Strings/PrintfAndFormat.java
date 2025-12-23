public class PrintfAndFormat {
    public static void main(String[] args) {
        float floatVar = 1.2f;
        int intVar = 2;
        String stringVar = "two";
        // instead of a one-time print statement like this:
       String fs1 = System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "and the string is %s",
                floatVar, intVar, stringVar).toString();

        System.out.println("\n" + fs1);

       String fs2 = """
                        The value of the float
                        variable is %f, while 
                        the value of the 
                        integer variable is %d
                        and the string is %s
                        """.formatted(floatVar, intVar, stringVar);

        System.out.println("\n" + fs2);

        // ... create a formatted string that you can reuse like this:
        String fs;
        fs = String.format("\nThe value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);
    }
}
