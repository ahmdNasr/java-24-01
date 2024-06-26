public class Arrays {
    public static void main(String[] args) {
        // Variablen sind Speicherorte für daten
        // Typen, Casting

        int[] personenAlter = { 34, 23, 34, 29, 10, 9, 56, 2, 18, 19  }; // Array (Liste), Elemente (Inhalt) mit Index (Nummerierung anfangen bei 0)
        int alterZehn = personenAlter[4];
        System.out.println(alterZehn);
        personenAlter[4] = 11;
        alterZehn = personenAlter[4];
        System.out.println(alterZehn);

        int lastAge = personenAlter[personenAlter.length - 1];
        System.out.println(lastAge);

        String[] personenAlter2 = new String[5]; // Standard-Werte sind 0, 0.0, null, false, ...
        // personenAlter2[0] = 34;
        // personenAlter2[1] = 23;
        // personenAlter2[2] = 34;
        // personenAlter2[3] = 29;
        // personenAlter2[4] = 10;
        // personenAlter2[5] = 9;

        System.out.println(personenAlter2[0]);
        System.out.println(personenAlter2[1]);
        System.out.println(personenAlter2[2]);
        System.out.println(personenAlter2[3]);
        System.out.println(personenAlter2[4]);
    }
}