public class Recursion {
    public static void main(String[] args) {
        
    }

    // nur kleinbuchstaben
    // keine leerzeichen
    // "Amok Oma" X (wegen leerzeichen und case)
    // "lageregal", "otto", "anna", "amokoma" ✅
    // rekursiv
    // otto
    // o == o --> next
    // t == t --> next
    // "" -> true

    // ott2o
    // o == o --> next
    // t == 2 --> false
    public static boolean isPalindrome(String input) {
        int inputLength = input.length();
        // input ist leer oder 1 zeichen ==> return true
        if (inputLength <= 1) return true; // Base Case
        // input von vorne und hinten matchen nicht ==> return false
        if(input.charAt(0) != input.charAt(inputLength - 1)) return false;
        // input kürzen und weitergeben
        String nextInput = input.substring(1, inputLength - 1);
        return isPalindrome(nextInput);
    }
}