public class CreatingStrings {
    public static void main(String[] args) {
        // Most direct way to create a string is to write:
        String greeting = "Hello world!"; // A string literal - Series of characters in your code that is enclosed in double quotes
        System.out.println(greeting);

        // Like any other object, you can create String objects using the new keyword.
        // E.g. Using Constructor: String(char[] value)
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}
