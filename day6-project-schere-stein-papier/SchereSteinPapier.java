import java.util.Scanner;

public class SchereSteinPapier {

    public static final int SCHERE = 0;
    public static final int STEIN = 1;
    public static final int PAPIER = 2;
    public static final int BEENDEN = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier, 3 = Beenden");
            int userInput = scanner.nextInt();
            if (userInput == BEENDEN) {
                System.out.println("Das spiel wurde beendet.");
                break;
            }

            boolean inputOutOfBounds = userInput < 0 || userInput > 3;
            if (inputOutOfBounds) {
                System.out.println("Ungültige Eingabe");
                continue;
            }
            int computerChoice = (int)(Math.random() * 3);

            System.out.println("Deine Wahl: " + choiceToString(userInput));
            System.out.println("Wahl des Computers: " + choiceToString(computerChoice));

            printWinner(userInput, computerChoice);
        }

        scanner.close();
    }

    public static String choiceToString(int choice) {
        String[] choices = { "Schere", "Stein", "Papier"};
        return choices[choice];
    }

    public static void printWinner(int userInput, int computerChoice) {
        if (userInput == computerChoice) {
            System.out.println("Unentschieden");
            return; // funktion beenden
        }

        boolean userWins = 
            (userInput == SCHERE && computerChoice == PAPIER) ||
            (userInput == STEIN && computerChoice == SCHERE) ||
            (userInput == PAPIER && computerChoice == STEIN);

        if(userWins) System.out.println("Spieler hat gewonnen");
        else System.out.println("Der Computer hat gewonnen");
    }
}