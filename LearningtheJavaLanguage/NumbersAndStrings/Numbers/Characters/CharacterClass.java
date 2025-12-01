public class CharacterClass {

    public static void main(String[] args) {

        char letter = 'a';
        char digit = '5';
        char space = ' ';
        char upper = 'Z';
        char lower = 'm';

        System.out.println("=== Character Class Method Demonstrations ===\n");

        // isLetter
        System.out.println("isLetter('a'): " + Character.isLetter(letter));
        System.out.println("isLetter('5'): " + Character.isLetter(digit));

        // isDigit
        System.out.println("isDigit('5'): " + Character.isDigit(digit));
        System.out.println("isDigit('a'): " + Character.isDigit(letter));

        // isWhitespace
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(space));
        System.out.println("isWhitespace('a'): " + Character.isWhitespace(letter));

        // isUpperCase / isLowerCase
        System.out.println("isUpperCase('Z'): " + Character.isUpperCase(upper));
        System.out.println("isLowerCase('m'): " + Character.isLowerCase(lower));

        // toUpperCase / toLowerCase
        System.out.println("toUpperCase('m'): " + Character.toUpperCase(lower));
        System.out.println("toLowerCase('Z'): " + Character.toLowerCase(upper));

        // toString
        System.out.println("toString('a'): " + Character.toString(letter));
    }
}

