public class Recursion {
    public static void main(String[] args) {
        System.out.println(reverse("Andreas"));
        System.out.println(reverse("Vittorio"));
        System.out.println(reverse("René"));
        System.out.println(reverse("Zana"));
        System.out.println(reverse("Marcus"));
        System.out.println(reverse("Deng"));
        System.out.println(reverse("Yan"));
        System.out.println(reverse("Ahmed"));

        int[] zahlen = { 3, 5, 6, 120, 29, -23, 3 };
        int summe = sum(zahlen);
        System.out.println(summe);
    }

    public static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    // sum 3, 5, 6, 120
    // 3 + sum 5, 6, 120
    // 3 + 5 + sum 6, 120
    // 3 + 5 + 6 + sum 120
    // 3 + 5 + 6 + 120 + sum
    // 3 + 5 + 6 + 120 + 0
    public static int sum(int[] numbers, int index) {
        // Base Case
        if(index >= numbers.length) return 0; // sum({}) = 0
        // Recursion Step
        return numbers[index] + sum(numbers, index + 1);
    }

    // lastChar + reverse(input)
    // reverse("Hallo")
    // o + reverse("Hall")
    // o + l + reverse("Hal")
    // o + l + l + reverse("Ha")
    // o + l + l + a + reverse("H")
    // o + l + l + a + H
    // WAS (declarativ) --- WIE (imperativ)
    public static String reverse(String input) {
        // Base Case
        if(input.length() <= 1) return input; // reverse("H") --> "H"
        // Recursion Step 
        int lastIndex = input.length() - 1;
        return input.charAt(lastIndex) + reverseOverview(input.substring(0, lastIndex)); // reverse("AB") --> "B" + reverse("A")
    }
    
    public static String reverseOverview(String input) {
        // Base Case
        if(input.length() <= 1) return input; // reverse("H") --> "H"
        // Recursion Step 
        int lastIndex = input.length() - 1;
        char lastChar = input.charAt(lastIndex);
        String rest = reverseOverview(input.substring(0, lastIndex));
        return lastChar + rest; // reverse("AB") --> "B" + reverse("A")
    }
    
    // Reverse
    public static String reverseLoop(String input) {
        String output = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
