public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {

    // takes in a string, ex something => omethingsay 
    // look at the begining of the sentence 
    // if the beginning of the sentence is a vowel, leave as is then move forward
    // not a vowel, move that value/letter to the end of the string 
    // also add ay to the end of that string 
    // return the string 


        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || 
            word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {

                result = result + word + " "; 

            } else {
                char firstLetter = word.charAt(0);
                word = word.substring(1);
                result = result + word + firstLetter + "ay" + " ";
            }

        }

        return result.trim();
    }

    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
