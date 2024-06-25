public class DoubleInput {
    public static void main(String[] args) {
        // eg java DoubleInput 90230
        // --> 180460
        int zahlInput = Integer.parseInt(args[0]);
        int zahlOutput = zahlInput * 2;
        System.out.println(zahlOutput);
    }
}
