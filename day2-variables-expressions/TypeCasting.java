public class TypeCasting {
    public static void main(String[] args) {
        String zahlString = "5";
        // int zahl = (int)zahlString; // Cannot cast String to int ==> stattdessen kann man einen String parsen
        int zahl = Integer.parseInt(zahlString);

        System.out.println(zahlString + 1); // 51
        System.out.println(zahl + 1); // 6
    }

    // 06
    // public static void main(String[] args) {
    //     // Umwandlung groß in klein in einer expression
    //     char groß = 'Y';
    //     char klein = (char)((byte)groß + 32);
    //     System.out.println(groß);
    //     System.out.println(klein);
    // }

    // 05
    // public static void main(String[] args) {
    //     // Umwandlung klein in groß
    //     char klein = 'c';
    //     char groß = (char)((int)klein - 32);
    //     System.out.println(klein);
    //     System.out.println(groß);
    // }

    // 04
    // public static void main(String[] args) {
    //     char c = 'A';
    //     byte zahlByte = 127;
    //     short zahlShort = 3;
    //     int zahl = 3;
    //     long zahlLong = 3;

    //     // 128 ist nicht mehr in der range von einem byte (-128 bis +127),
    //     // daher muss die 128 (wird als int interpretiert) in ein byte gecastet werden
    //     byte zahlOversized = (byte)128; 
    //     System.out.println(zahlOversized);

    //     byte charCode = (byte)c;
    //     System.out.println(c);
    //     System.out.println(charCode);
    //     System.out.println("----------");
    //     System.out.println((byte)'A');
    //     System.out.println((byte)'B');
    //     System.out.println((byte)'C');
    //     System.out.println((byte)'D');
    //     System.out.println((byte)'E');
    //     System.out.println((byte)'F');
    //     System.out.println("...");
    //     System.out.println((byte)'Z');
    //     System.out.println("kleinbuchstaben");
    //     System.out.println((byte)'a');
    //     System.out.println((byte)'b');
    //     System.out.println((byte)'c');
    //     System.out.println("...");
    //     System.out.println((byte)'z');
        

    //     byte meinAnfangsbuchstabeCode = 97;
    //     char meinAnfangsbuchstabe = (char) meinAnfangsbuchstabeCode;
    //     System.out.println(meinAnfangsbuchstabe);
    // }

    // 03
    // public static void main(String[] args) { 
    //     float age = 10.78f;
    //     System.out.println(age);

    //     // cast age into int ageUnprecise
    //     int ageUnprecise = (int) age;
    //     System.out.println(ageUnprecise);
    // }
    
    // 02
    // public static void main(String[] args) {
    //     double age = 10.756;
    //     System.out.println(age);
        
    //     int ageUnprecise = (int)age;
    //     System.out.println(ageUnprecise);
    // }
    
    // 01
    // public static void main(String[] args) {
    //     // String --> text
    //     // char --> einzelner character
    //     // int, double, float --> zahlen
    //     // boolean --> Wahrheitswert true/false

    //     // Casting

    //     int age = 10;
    //     System.out.println(age);

    //     double agePrecise = age;
    //     System.out.println(agePrecise);
    // }    
}