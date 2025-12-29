public class NumbersToString {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;

        // Sometimes you need to convert a number to a string because you need to operate on the value in its string form

        // several easy ways to convert a number to a string:

        // 1. Concatenate "i" with an empty string; conversion is handled for you.
        String concatenatedInt = intValue + "";
        String concatenatedDouble = doubleValue + "";

        // 2. Using String.valueOf()
        String intAsString = String.valueOf(intValue);
        String doubleAsString = String.valueOf(doubleValue);

        // 3. Each of the Number subclasses includes a class method, toString(), that will convert its primitive type to a string
        // E.g. Integer.toString() and Double.toString()
        String intAsString2 = Integer.toString(intValue);
        String doubleAsString2 = Double.toString(doubleValue);

        // Print the results
        System.out.println("Concatenated Integer: " + concatenatedInt);
        System.out.println("Concatenated Double: " + concatenatedDouble);
        System.out.println("Integer as String (valueOf): " + intAsString);
        System.out.println("Double as String (valueOf): " + doubleAsString);
        System.out.println("Integer as String (toString): " + intAsString2);
        System.out.println("Double as String (toString): " + doubleAsString2);
    }
}
