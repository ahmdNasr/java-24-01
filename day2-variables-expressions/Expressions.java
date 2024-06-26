
// Expression = Ausdruck
public class Expressions {
    public static void main(String[] args) {
        int f = (3 * 4) - 1; // 11
        int d = (39 - 2) % 49; // 37
        boolean result = !(f < d && false); // true
        System.out.println(result);
    }

    public static void mainIntro(String[] args) {
        // arithmetische Expressions
        int simple = 3 * 4; // +, -, *, /, (), % // ergibt 12
        int other = (simple + 10) % simple; // eribt 10
        // conditional Expressions
        boolean simpleBiggerOther = simple > other; // >, >=, <, <=
        System.out.println(simpleBiggerOther);
        boolean simpleBiggerTwelve = simple > 12; // >, >=, <, <=
        System.out.println(simpleBiggerTwelve);
        boolean simpleBiggerEqualTwelve = simple >= 12; // ==, !=
        boolean simpleEqualTwelve = simple == 12; // ==, !=
        System.out.println(simpleBiggerEqualTwelve);
        System.out.println(simpleEqualTwelve);
        boolean simpleNotEqualTwelve = simple != 12;
        System.out.println(simpleNotEqualTwelve);
        // logische Expressions
        boolean simple12Other10 = simple == 12 && other == 10; // &&, ||, !
        System.out.println(simple12Other10);
        boolean notSimple12Other10 = !simple12Other10; // &&, ||, !
        System.out.println(notSimple12Other10);
        // ////////
        // increment, decrement
        int counter = 0;
        counter++; // increment by 1
        System.out.println(counter);
        counter--; // decrement by 1
        System.out.println(counter);
        // zuweisungsoperatoren
        counter += 10; // counter = counter + 10;
        System.out.println(counter);
        System.out.println(counter--); // gibt den jetzigen wert zurück und speichert 1 weniger in die varibale (gegenstück ist --counter)
        System.out.println(counter);
        counter -= 2;
        counter *= 100;
        counter /= 100;
        counter %= 2;
    }
}
