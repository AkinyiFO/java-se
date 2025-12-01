public class EscapeSequence {

    public static void main(String[] args) {

        System.out.println("=== Escape Sequence Demonstrations ===\n");

        // \t Tab
        System.out.println("Tab example: Hello\tWorld");

        // \b Backspace (removes the previous character in many consoles)
        System.out.println("Backspace example: ABC\bD");

        // \n Newline
        System.out.println("Newline example:\nThis is on a new line.");

        // \r Carriage return
        System.out.println("Carriage return example:");
        System.out.println("12345\rABCDE"); // Moves cursor to the beginning and overwrites depending on console behavior
        System.out.println("Hello World\rHi");

        // \f Form feed (page break, may not be visible in typical consoles)
        System.out.println("Form feed example: Hello\fWorld");

        // Single quote
        System.out.println("Single quote example: It\'s Java!");

        // Double quote
        System.out.println("Double quote example: She said, \"Hello!\"");

        // \\ Backslash
        System.out.println("Backslash example: C:\\Users\\Java");
    }
}

