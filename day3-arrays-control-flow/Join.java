public class Join {
    public static void main(String[] args) {
        // in js: ["hallo", "welt", "!"].join(' ') --> "hallo welt !"

        // java Join Hallo Welt ! .
        // > Hallo.Welt.!

        // java Join Hallo Welt ! #
        // > Hallo#Welt#!
        
        // java Join Hallo Marcus wie geht es dir ! _
        // > Hallo Marcus wie geht es dir !

        // Tipp: print und println beachten ;)

        String trennung = args[args.length - 1]; // if trennung == " "
        if (trennung.equals("_")) { // == vergleicht die werte nur bei primitiven typen, bei referenztypen wird die referenz geprüft und nicht der wert dahinter!
            trennung = " "; // Unterstrich überschreiben mit einem Leerzeichen
        }

        int i = 0;
        while (i <= args.length - 2) {
            System.out.print(args[i] + trennung);
            i++;
        }
        System.out.println(); // Zeilenumbruch
    }
}