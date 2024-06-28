import java.util.Scanner; 

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in ist die quelle die gescannt werden soll

        boolean letin = true;
        while(letin) {
            System.out.println("Wie alt sind Sie? Geben Sie das Alter an, oder 0 zum Beenden:");
            int alterInput = scanner.nextInt();

            if (alterInput <= 0) { 
                break; // schleife abbrechen "exit"
            }

            if(alterInput >= 18) {
                System.out.println("Willkommen herein");
            } else {
                System.out.println("Die Party ist vorbei");
                letin = false;
            }
        }
                
        System.out.println("Programm wird beendet");
        scanner.close();
    }
}
