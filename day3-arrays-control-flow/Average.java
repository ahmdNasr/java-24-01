public class Average {
    public static void main(String[] args) {
        // java Average 19 0 239 30 459 30 29
        // > 115.1428571429

        // Durchschnitt = Sum/Anz --> Chunking
        double sum = 0.0; // Accumulator (Akkumulator) ==> Variable die ein Zwischenergebnis speichert!!!
        int anz = args.length;
        int i = 0;
        while(i < anz) {
            sum += Double.parseDouble(args[i]);
            i++;
        }
        System.out.println(sum/anz);
    }
}
