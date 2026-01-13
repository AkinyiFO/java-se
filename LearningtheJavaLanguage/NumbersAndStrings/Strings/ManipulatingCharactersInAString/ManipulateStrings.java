public class ManipulateStrings {
    public static void main(String[] args) {
        // Finding characters within a string by index
        // Accessor Method: char charAt(int index)
        String anotherPalindrome = "Niagara. O roar again!";
        char aChar = anotherPalindrome.charAt(9);
        System.out.println(aChar);

        // Finding substrings within a string by index
        // Accessor Method: String substring(int beginIndex)
        String again = anotherPalindrome.substring(16); // beginIndex is inclusive
        System.out.println(again);

        // Accessor Method: String substring(int beginIndex, int endIndex)
        String roar = anotherPalindrome.substring(11, 15); // endIndex is exclusive
        System.out.println(roar);

        // Other methods
        // String[] split(String regex)
        String [] words = anotherPalindrome.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // String[] split(String regex, int limit)
        String [] limitedWords = anotherPalindrome.split(" ", 3);
        for (String word : limitedWords) {
            System.out.println(word);
        }

        // CharSequence subSequence(int beginIndex, int endIndex)
        CharSequence subSeq = anotherPalindrome.subSequence(11, 15);
        System.out.println(subSeq);

        // String trim()
        String original = "  Removed leading and trailing spaces  ";
        String trimmed = original.trim();
        System.out.println(trimmed);

        // Changing case
        //String toUpperCase()
        String uppercased = trimmed.toUpperCase();
        System.out.println(uppercased);

        // String toLowerCase()
        String lowercased = trimmed.toLowerCase();
        System.out.println(lowercased);

        // Searching characters and substrings within strings
        //  Accessor Method: indexOf() methods search forward from the beginning of the string
        //  Accessor Method: lastIndexOf() methods search backward from the end of the string
        //  If a character or substring is not found, indexOf() and lastIndexOf() return -1.
        // int indexOf(int ch)
        int firstIndex = anotherPalindrome.indexOf('a');
        // int firstIndex = anotherPalindrome.indexOf(97); // ASCII value of 'a'
        System.out.println(firstIndex);

        // NOTE:
        //      indexOf() method is overridden. E.g. indexOf(int ch) and indexOf(String str)
        //      indexOf('a') is cheaper than indexOf("a") because the former doesn't have to create a new String object
        //      Use indexOf(String str) when searching for a sequence of characters (substring).

        // int lastIndexOf(int ch)
        int lastIndex = anotherPalindrome.lastIndexOf('a');
        System.out.println(lastIndex);

        // int indexOf(int ch, int fromIndex)
        int nextIndex = anotherPalindrome.indexOf('a', firstIndex + 1);
        System.out.println(nextIndex);

        // int lastIndexOf(int ch, int fromIndex)
        int prevIndex = anotherPalindrome.lastIndexOf('a', lastIndex - 1);
        System.out.println(prevIndex);

        // int indexOf(String str)
        int firstRoarIndex = anotherPalindrome.indexOf("roar");
        System.out.println(firstRoarIndex);

        // int lastIndexOf(String str)
        int lastRoarIndex = anotherPalindrome.lastIndexOf("roar");
        System.out.println(lastRoarIndex); // Same as firstRoarIndex in this case because "roar" appears only once

        String roarTwice= "A lion goes ROAR! ROAR!";
        int firstRoarInLion = roarTwice.indexOf("ROAR"); // Case-sensitive
        int lastRoarInLion = roarTwice.lastIndexOf("ROAR");
        System.out.println(firstRoarInLion);
        System.out.println(lastRoarInLion);

        // int indexOf(String str, int fromIndex)
        int nextRoarIndex = anotherPalindrome.indexOf("roar", 10);
        System.out.println(nextRoarIndex);

        // int lastIndexOf(String str, int fromIndex)
        int prevRoarIndex = anotherPalindrome.lastIndexOf("roar", 11);
        System.out.println(prevRoarIndex);

        // Examining the contents of strings
        // boolean contains(CharSequence s) - returns true if the string contains a particular character sequence
        // Use this method when you only need to know that the string contains a character sequence, but the precise location isn't important
        boolean subSeqFound = anotherPalindrome.contains(subSeq); // Passed a Charsequence object
        System.out.println(subSeqFound);
        boolean containsAgain = anotherPalindrome.contains("again"); // String class implements CharSequence interface
        System.out.println(containsAgain);


        // Replace characters
        // String replace(char oldChar, char newChar)
        String charReplaced = uppercased.replace('E', 'A');
        System.out.println("Char Replaced: '" + charReplaced + "'");

        // String replace(CharSequence target, CharSequence replacement)
        String replaced = uppercased.replace("AND", "WITH");
        System.out.println("Replaced: '" + replaced + "'");

        // String replaceAll(String regex, String replacement)
        String allReplaced = anotherPalindrome.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("All Replaced: '" + allReplaced + "'");

        // String replaceFirst(String regex, String replacement)
        String firstReplaced = anotherPalindrome.replaceFirst("[aeiouAEIOU]", "*");
        System.out.println("First Replaced: '" + firstReplaced + "'");
    }
}
