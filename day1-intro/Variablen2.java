public class Variablen2 {
    public static void main(String[] args) {        
        String name2 = null;
        System.out.println(name2); // Compile Error (Kann nicht auf einen Wert zugreifen der nicht initialisiert)
        name2 = "Peter Pan";
        System.out.println(name2);
        name2 = "Peter Bauer";
        // EndZustand 
        System.out.println(name2);
    }
}
