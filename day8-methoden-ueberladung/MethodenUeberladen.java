public class MethodenUeberladen {

    // main(String[])
    public static void main(String[] args) {
        printGreet("Ahmed");

        char[] hallo = { 'H', 'a', 'l', 'l', 'o' };
        System.out.print(hallo);
    }

    // Methoden Überladen
    // Signatur einer Methode (Name + Paramter Typen in einer Reihenfolge)
    // printGreet(String, int)
    public static void printGreet(String personName, int zahl) {
        for(int count = 0; count < zahl; count++) {
            System.out.println("Hello " + personName);
        }
    }

    // printGreet(String)
    public static void printGreet(String personName) {
        printGreet(personName, 1);
    }

    public static double mul(double d1, double d2) {
        return d1 * d2;
    }
    public static int mul(int z1, int z2) {
        return z1 * z2;
    }
}
