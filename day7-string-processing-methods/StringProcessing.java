public class StringProcessing {

    public static void main(String[] args) {
        System.out.println(equals(args[0], args[1]));
        System.out.println(toLowerCase("Hello Friends!"));
        System.out.println(toUpperCase("Hello Friends!"));
        System.out.println(indexOf("Hallo Freunde!", "unde!"));
    }


        // Hallo Welt!
        //         ^i
        //         lt
        //          ^searchIndex
        //   +x
        //         lt
        //         ++

    // Aufgabe: Implementiere deine eigene indexOf Methode:
    // input = "Hallo Freunde!"
    // search = "und"
    // indexOf(input, search) --> 9
    // indexOf(input, "blabla") --> -1 (kommt nicht vor)
    public static int indexOf(String input, String search) {
        for(int i = 0; i < input.length(); i++) {
            boolean localMatch = false;
            int searchIndex = 0;
            do {
                localMatch = input.charAt(i + searchIndex) == search.charAt(searchIndex);
                searchIndex ++;
            } while (localMatch && searchIndex < search.length());

            if(localMatch) return i;
        }
        return -1;
    }

    public static String toUpperCase(String input) {
        String output = ""; // Accumulator/Akkumulator (Zwischenspeicher)
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            boolean isUpperCaseLetter = current >= 'a' &&  current <= 'z';
            if (isUpperCaseLetter) {
                output += (char)(current - 32); // change to lower case!
            } else {
                output += current; // add as is
            }
        }
        return output;
    }

    public static String toLowerCase(String input) {
        String output = ""; // Accumulator/Akkumulator (Zwischenspeicher)
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            boolean isUpperCaseLetter = current >= 'A' &&  current <= 'Z';
            if (isUpperCaseLetter) {
                output += (char)(current + 32); // change to lower case!
            } else {
                output += current; // add as is
            }
        }
        return output;
    }

    // haben s1 und s2 den gleichen Wert ?
    public static boolean equals(String s1, String s2) {
        if (s1 == s2) return true;

        int s1Length = s1.length();
        int s2Length = s2.length();
        if (s1Length != s2Length) return false;

        // sind gleich lang und nicht der selbe string (aber vielleicht trotzdem gleich)
        for(int i = 0; i < s1Length; i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false; // beendet die ganze funktion!
        }

        return true; // beide strings haben den gleichen wert!
    }

    public static void mainIntro(String[] args) {
        String str = args[0];
        String search = args[1];
        boolean result = str.contains(search);
        System.out.println("contains:");
        System.out.println(result); 
        System.out.println("indexOf:");
        System.out.println(str.indexOf(search));

        String resultStr = str.substring(str.length()  - 1);
        System.out.println(resultStr);


        System.out.println("HALLO MEINE lieben LEUte!".toLowerCase());
        System.out.println("HALLO MEINE lieben LEUte!".toUpperCase());


        String f = "Hello";
        String k = "Hello";
        String l = f;

        System.out.println(f == k); // true ! (weil f und k beide im String constant pool an der gleichen Adresse sind)
        System.out.println(f == l); // true
        System.out.println(f.equals(k)); // true
        
        
        System.out.println("'Dynamische' String Werte:");
        System.out.println(args[0] == args[1]); // false
        System.out.println(args[0].equals(args[1])); // true

    }
}

// length
// charAt

// compareTo
// compareToIgnoreCase

// indexOf
// contains

// substring

// toUpperCase
// toLowerCase
