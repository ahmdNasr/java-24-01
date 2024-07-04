public class RecursionIntro {
    public static void main(String[] args) {
        // Schleifen -- Array
        
        printFibonacci(5);
        // Was ist rekursion ?
        // --> Methoden die sich selbst aufrufen nennt man rekursiv...
        //    +-> F --+ // F wäre eine rekursive Methode (sie ist von sich selber "abhängig")
        //    |       |
        //    +-------+
    }
    
    // Bsp Fibonnaci Folge: 
    // 1   1   2 3  5   8   13   21 ...
    //                  z1  z2  

    // Story-Point Schätzung (für Aufwand von Arbeitspacketen)
    // 1, 2, 3, 5, 8, 13, ...
    
    // Base Case z1 = 1, z2 = 1

    public static void printFibonacciLoop(int countFiboNumbers) {
        int z1 = 0;
        int z2 = 1;
        int z3 = 1;

        for (int i = 0; i < countFiboNumbers; i++) {
            z3 = z1 + z2;
            z1 = z2;
            z2 = z3;

            System.out.print(z1 + ", ");
        }
    }

    // printFibonacci(5)
    public static void printFibonacci(int countFiboNumbers) {
        printFibonacci(countFiboNumbers, 0, 0, 1);
    }
    // printFibonacci(...) ->  printFibonacci(...) ->  printFibonacci(...) ->  printFibonacci(...) -> ... -> RETURN;
    
    //                   i  z1 z2  // Console
    // printFibonacci(5, 0, 0, 1); // 0
    // printFibonacci(5, 1, 1, 1); // 1
    // printFibonacci(5, 2, 1, 2); // 1
    // printFibonacci(5, 3, 2, 3); // 2
    // printFibonacci(5, 4, 3, 5); // 3
    // printFibonacci(5, 5, 5, 8); RETURN;

    public static void printFibonacci(int countFiboNumbers, int i, int z1, int z2) {
        // base case --> stopped die rekursion
        if (i >= countFiboNumbers) return;
        System.out.print(z2 + " ");
        printFibonacci(countFiboNumbers, i + 1, z2, z1 + z2); // Recursion-Step
        // System.out.print(z2 + " "); // wäre sysout NACH dem rekursions-schritt, hätten wir die Ausgabe umgedreht
    }
    
    public static int[] makeFibonacciArray(int countFiboNumbers) {
        int[] fibs = new int[countFiboNumbers];
        fibs[0] = 1;
        fibs[1] = 1;

        for (int i = 2; i < countFiboNumbers; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        return fibs;
    }

    
}