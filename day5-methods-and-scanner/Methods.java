public class Methods {

    public static void main(String[] args) {
        double meineGroesse = 176;
        double meinGewicht = 85;
        double meinBmiWert = calculateBMI(meineGroesse, meinGewicht); // meineGroesse & meinGewicht heißen hier nicht mehr Parameter sondern Argumente!!
        System.out.println(meinBmiWert);

        double seineGroesse = 195;
        double seinGewicht = 110;
        double seinBmiWert = calculateBMI(seineGroesse, seinGewicht);
        System.out.println(seinBmiWert);

        int result = bmiCompare(meineGroesse, meinGewicht, seineGroesse, seinGewicht);
        if(result == 1) {
            System.out.println("Mein BMI ist größer");
        } else if (result == -1) {
            System.out.println("Mein BMI ist kleiner");
        } else {    
            System.out.println("Wir haben den gleichen BMI");
        }
    }

    // boolean
    // true = bmi of person1 > bmi of person2
    // false otherwise
    // int
    // -1 person1 < person2
    // 0  person1 = person2
    // 1  person1 > person2
    public static int bmiCompare(double person1Height, double person1Weight, double person2Height, double person2Weight) {
        // 4 parameter ---> Platzhalter variable (mit unbekanntem wert)
        double person1BMI = calculateBMI(person1Height, person1Weight);
        double person2BMI = calculateBMI(person2Height, person2Weight);

        if(person1BMI < person2BMI) {
            return -1;
        } else if (person1BMI > person2BMI) {
            return 1;
        } else {
            return 0;
        }
    }

    // 2 Inputs (Parameter): personHeight, personWeight
    // Rückgabetyp ist double ( zb 20.14 ) --> return-Wert ist bmiValue (typ double)
    public static double calculateBMI(double personHeight, double personWeight) {
        double heightInMeters = personHeight / 100;
        double bmiValue = personWeight / (heightInMeters * heightInMeters);
        return bmiValue; // Errechneten Wert zurückgeben beim Aufruf 
    }


    public static void mainIntro(String[] args) {
        sayHelloFiveTimes(); // Methodenaufruf
        
        // ...
        int x = 1+1;
        System.out.println(x);
        
        sayHelloFiveTimes(); // Methodenaufruf
    }
    public static void sayHelloFiveTimes() {
        System.out.println("Hello\nHello\nHello\nHello\nHello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
    }

    // Methode erstellen (siehe syntax oben)
    // Methode aufrufen / verwenden  sayHelloFiveTimes();

    // Vorteile:
    // + Übersichtlichkeit durch weniger code und Auslagerung
    // + Auslagerung --> Wiederverwenden
    // + Auslagerung --> Abstraktion !!!!! (mächtig) --- Wie ein selbst definierter Befehl
}