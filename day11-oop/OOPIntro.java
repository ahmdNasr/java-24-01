
public class OOPIntro {
    // Datenverarbeitung => Daten und Verarbeitung
    // Datensatz: vorname, nachname, gebdatum, adresse, tel, email, historische meldedaten, einträge bei polizei, justiz 
    // Datenpunkte bilden einen Datensatz
    public static void main(String[] args) {
        // int x = 3;
        // String f = "hello";
        // int[], int[][], String[][]
        // boolean, double, float, char, byte, short, long

        // if/else, while, for, ...

        // new ruft konstruktoren der klasse auf, um ein Objekt zu erstellen
        // String name = "Hallo";
        Person person1 = new Person(); // Default Constructor (Standardkonstruktor)
        System.out.println(person1.getAlter());

        person1.setVorname("Thomas");
        person1.setNachname("Bauer");
        person1.setAlter(-36);

        // System.out.println(person1); // print out reference to the object in memory
        person1.printPerson();
        
        Person person2 = new Person("Christian B.", -55);
        person2.printPerson();
        
        Person personAufgabe = new Person("Thomas Bauer (36)");
        personAufgabe.printPerson();
    }
    
}
