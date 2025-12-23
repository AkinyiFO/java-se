public class PrintfAndFormat {
    public static void main(String[] args) {
        float floatVar = 1.2f;
        int intVar = 2;
        String stringVar = "two";
        // instead of a one-time print statement like this:
       System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "and the string is %s",
                floatVar, intVar, stringVar);

        // ... create a formatted string that you can reuse like this:
        String fs;
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);
    }
}
