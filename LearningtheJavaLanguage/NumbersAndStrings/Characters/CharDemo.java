public class CharDemo {
    public static void main(String[] args) {
        char ch = 'a';
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        // Unicode for uppercase Greek omega character
        char uniCharac = '\u03A9';
        System.out.println(uniCharac);
        char uniChar = 'Ω';
        System.out.println(uniChar);

        // Autoboxing
        Character character = 'a';
        // Old way - Removed because it creates new object every time (bad)
        // Character characterOld = new Character('a');

        // Unnecessary - Used by Autoboxing (Factory method) under the hood
        Character charJavac = Character.valueOf('a');
    }
}
