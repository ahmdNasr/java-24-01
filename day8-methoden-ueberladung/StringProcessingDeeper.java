public class StringProcessingDeeper {
    public static void main(String[] args) {

        String s = "Hallo meine Freunde, ich bin zurück in DD!";
        // "Hallo me"
        // "ne Freunde, "
        // "ch b"
        // "n zurück "
        // "n DD!"
        String[] parts = split(s, "i"); //; s.split("i");

        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
        System.out.println(parts[4]);
        // System.out.println(parts[5]); // java.lang.ArrayIndexOutOfBoundsException
    }

    // n zurück in DD!
    public static String[] split(String input, String delimiter) {
        int partsCount = countDelimiter(input, delimiter) + 1;
        String[] parts = new String[partsCount];
        int partIndex = 0;
        
        String inputRest = input;
        while(partIndex < partsCount) {
            int nextDelimiter = inputRest.indexOf(delimiter);
            // System.out.println(inputRest + " -- " + nextDelimiter + " -- " + partIndex);

            // ternary operator ~ if / else
            parts[partIndex] = nextDelimiter > 0
                ? inputRest.substring(0, nextDelimiter) 
                : inputRest;

            inputRest = inputRest.substring(nextDelimiter + 1);
            partIndex++;
        }
        return parts;
    }
    public static int countDelimiter(String input, String delimiter) {
        int fromIndex = 0;
        int counts = 0;
        while(true) {
            int delimiterIndex = input.indexOf(delimiter, fromIndex);
            if(delimiterIndex >= 0) {
                counts++;
                fromIndex = delimiterIndex + 1;
            } else {
                break;
            }
        }
        return counts;
    }


    public static void mainIntro(String[] args) {
        String input = "Willkommen herein :)";
        System.out.println(substring(input, 4, 10));
        System.out.println(substring(input, input.length() - 2));
        
        System.out.println("//// Palindrome");

        System.out.println( palindrome("Amok oma"));
        System.out.println( palindrome("Ein Esel lese nie"));
        System.out.println( palindrome("Anna"));
        System.out.println( palindrome("Otto"));
        System.out.println( palindrome("123          432 1"));
        System.out.println( palindrome("Lagerregal"));
        System.out.println( palindrome("Hallo"));
        
    }

    // "Hallo".substring(2, 3) // "l"
    public static String substring(String input, int beginIndex, int endIndex) {
        boolean validInput = 
            beginIndex >= 0 &&
            beginIndex <= endIndex &&
            endIndex <= input.length();
        if(!validInput) return null;

        String substr = "";
        for(int i = beginIndex; i < endIndex; i++) {
            substr += input.charAt(i);
        }
        return substr;
    }
    // "Hallo".substring(2) // "llo"
    public static String substring(String input, int beginIndex) {
        return substring(input, beginIndex, input.length());
    }

    // palindrom(input)
    // true wenn  ohneLeerzeichen(input.toLowerCase()) == umdrehen(ohneLeerzeichen(input.toLowerCase())) 

    
    public static String removeSpaces(String input) {
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current != ' ') output += current;
        } 
        return output;
    }
    public static String reverseString(String input) {
        String output = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
    
    // Micro-Step BY Micro-Step--1-------------------------------2----Definition
    // WAS ist ein palindrom ? (Beschreibung)   ----> Deklarativ (declarative programming paradigm) /// Funktionale Programmieren
    public static boolean palindrome(String input) {
        String inputSanitized = removeSpaces(input).toLowerCase();
        boolean isPalindrome = reverseString(inputSanitized).equals(inputSanitized);
        return isPalindrome;
    }
    
    // WIE ermitteln wir ein palindrom ? (Rezept) ---> Imperativ (imperative programming paradigm)
    public static boolean palindrome1(String input) {
        int startIndex = 0;
        int endIndex = input.length() - 1;

        while(startIndex < endIndex) {
            char front = ' ';
            char back = ' ';

            while(front == ' ') {
                front = input.charAt(startIndex);
                if(front >= 'A' && front <= 'Z') front = (char)(front+32);
                startIndex ++;
            }
            while(back == ' ') {
                back = input.charAt(endIndex);
                if(back >= 'A' && back <= 'Z') back = (char)(back+32);
                endIndex --;
            }
            
            if(front != back) return false;
        }

        return true;
    }


    // palindrom
    // substring
    // compareTo
    // split
}
