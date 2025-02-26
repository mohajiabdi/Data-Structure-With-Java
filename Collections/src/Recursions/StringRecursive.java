package Recursions;

public class StringRecursive {
    public static void main(String[] args) {
        String str = "Ali";
        System.out.println("Ali has more vowels: " + vowelMore(str));
    }


    static boolean vowelMore(String str) {
        int size = str.length();
        int vowels = 0;
        int consonants = 0;

        // Call the helper function to process characters
        return vowelMoreHelper(str, 0, vowels, consonants);
    }

    private static boolean vowelMoreHelper(String str, int index, int vowels, int consonants) {
        int size = str.length();

        // Base case: If we have processed all characters, compare vowels and consonants
        if (index == size) {
            return vowels > consonants;
        }

        // Update vowels and consonants based on the current character
        char ch = str.charAt(index);
        vowels += countVowels(ch);
        consonants += countConsonants(ch);

        // Recursive call with updated index and counts
        return vowelMoreHelper(str, index + 1, vowels, consonants);
    }

    private static int countVowels(char ch) {
        // Only count if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return 1;
        }
        return 0;
    }

    private static int countConsonants(char ch) {
        // Count consonants only if the character is a letter and not a vowel
        if (Character.isLetter(ch)) {
            return 1;
        }
        return 0;
    }

}
