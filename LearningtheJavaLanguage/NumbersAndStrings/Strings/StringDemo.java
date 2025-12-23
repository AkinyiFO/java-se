public class StringDemo {
    public static void main(String[] args) {
        // A palindrome is a word or sentence that is symmetric—it is spelled the same forward and backward, ignoring case and punctuation
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("The palindrome length is " + len);

        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        // A short and inefficient program to reverse a palindrome string using charAt(i)
        for (int i = 0; i < len; i++) {
            // convert the string to an array of characters
            tempCharArray[i] = palindrome.charAt(i);
        }

        // Replace the manual loop with getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        // Copies the entire string (from index 0 to len-1) into tempCharArray starting at position 0
//         palindrome.getChars(0, len, tempCharArray, 0);

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            // reverse the array into a second array
            charArray[j] = tempCharArray[len - 1 - j];
        }

        // convert back to a string
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
