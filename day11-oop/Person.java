
// Klasse ist eine Beschreibung für Datensätze (realisieren wir durch erstellen von Objekten!)
// Klassen erzeugen Objekte (durch den Konstruktor der Klasse)
public class Person {
    // Datenpunkte --> Attribute (Eigenschaften)
    private String vorname;
    private String nachname;
    private int alter;

    // Konstruktoren - Ein Konstruktur wird nur 1 mal ausgeführt um das Objekt anzulegen!!
    public Person() {
        this.alter = 18;
    }

    // "Thomas Bauer", 36.212
    // public Person(String name, double alter) {
    //     String[] nameParts = name.split(" ");
    //     this.vorname = nameParts[0];
    //     this.nachname = nameParts[1];
    //     this.alter = (int) alter;
    //     if(this.alter < 0) this.alter = 18; // Einschränkung, das alter ist entweder positiv, oder fällt zurück auf 18 (wenn nicht positiv)
    // }
    public Person(String name, double alter) {
        String[] nameParts = name.split(" ");
        this.setVorname(nameParts[0]);
        this.setNachname(nameParts[1]);
        this.setAlter(alter);
    }

    // "Vorname Nachname (4)"
    // "Vorname Nachname (39)" 
    // public Person(String personInfo) {
    //     String[] infoParts = personInfo.split(" ");
    //     this.vorname = infoParts[0];
    //     this.nachname = infoParts[1];
    //     String alterString = infoParts[2].substring(1, infoParts[2].length() - 1);
    //     this.alter = Integer.parseInt(alterString);
    // }
    public Person(String personInfo) {
        String[] infoParts = personInfo.split(" ");
        this.setVorname(infoParts[0]);
        this.setNachname(infoParts[1]);
        String alterString = infoParts[2].substring(1, infoParts[2].length() - 1);
        this.setAlter(Integer.parseInt(alterString));
    }

    // Getter und Setter Methoden
    public String getVorname() {
        return vorname; // hier könnte ich "logik zwischenschalten" zB return vorname.toUpperCase();
    }

    public String getNachname() {
        return nachname.toUpperCase();
    }

    public int getAlter() {
        return alter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname.trim(); // "      Ahmed     " -trim()-> "Ahmed"
    }

    public void setNachname(String nachname) {
        this.nachname = nachname.trim();
    }

    public void setAlter(double alter) {
        if (alter < 0) this.alter = 18;
        else this.alter = (int)alter;
    }

    public String toString() {
        return this.getVorname()
        + " " 
        + this.getNachname()
        + " (" + this.getAlter() + ")";
    }

    public void printPerson() {
        System.out.println(this.toString());
    }
}
// Ding, Etwas - "Entität"