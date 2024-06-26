public class ControlFlow {
    public static void main(String[] args) {
        int howOftenToSayHello = Integer.parseInt(args[0]);
        while (howOftenToSayHello > 0) {
            if(howOftenToSayHello % 3 == 0) {
                howOftenToSayHello--;
                break;
            }

            System.out.println("Hallo nr. " + howOftenToSayHello );
            howOftenToSayHello--;
        }
    }

    public static void mainAbzweigung(String[] args) {
        // Abzweigung und Iteration
        // Abzweigungen/Branching: if/else, switch
        // Iterationen: Schleifen (while, for, do-while)
        int age = Integer.parseInt(args[0]);
        boolean isOverage = age >= 18;
        
        String greeting;
        if (isOverage) {
            // Statement-Block, Code-Block, nur "Block" (hier konkret auch if-Block)
            // Man kann Codeblocks verschachteln (block im block), auf eng. nesting
            greeting = "Welcome in";
        } else {
            greeting = "The party is closed";
        }
        System.out.println(greeting);
    }
}
