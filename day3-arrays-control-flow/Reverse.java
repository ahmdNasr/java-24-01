public class Reverse {
    public static void main(String[] args) {
        // java Reverse 19 0 239 30 459 30 29
        // > 29 30 459 30 239 0 19
        int i = args.length - 1;
        while (i >= 0) {
            System.out.print(args[i] + " ");
            i--;
        }
        System.err.println();
    }
}
