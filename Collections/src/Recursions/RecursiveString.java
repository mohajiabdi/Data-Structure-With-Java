package Recursions;

public class RecursiveString {

    public static void main(String[] args) {
        String str = "ali";
        System.out.println(vowelMore(str));

    }


    // recursive method taking string arguments and returning which one is more Vowels or Constants
//    public static String findMoreVowelsOrConstants(String str) {
//        if (str.isEmpty()) {
//            return "";
//        }
//
//        char ch = str.charAt(0);
//
//        if (Character.isLetter(ch)) {
//            if (Character.isUpperCase(ch)) {
//                ch = Character.toLowerCase(ch);
//            }
//
//            int vowelCount = countVowels(ch);
//            int constantCount = countConstants(ch);
//
//            if (vowelCount > constantCount) {
//                return ch + findMoreVowelsOrConstants(str.substring(1));
//            } else if (vowelCount < constantCount) {
//                return findMoreVowelsOrConstants(str.substring(1)) + ch;
//            } else {
//                return findMoreVowelsOrConstants(str.substring(1)) + ch;
//            }
//        } else {
//            return findMoreVowelsOrConstants(str.substring(1));
//        }
//    }
    static boolean  vowelMore(String str) {
        int size = str.length();
        int index = 0;
        int vowels = 0;
        int consonants = 0;


        if(index < size) {
            vowels +=countVowels(str.charAt(index));
            consonants += countConstants(str.charAt(index));
            index++;
            return vowelMore(str);
        }





        return vowels > consonants;
    }

    private static int countConstants(char ch) {
        if (Character.isLetter(ch) ) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int countVowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1;
        } else {
            return 0;
        }
    }
}
