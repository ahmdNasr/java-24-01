public class HelloWorld {
    // Syntax Error --> "falsches Java" (erkennt man beim complieren javac)
    // Runtime Error --> zb mit Werte arbeiten die es nicht gibt 
    // Semantic Error --> semantischer/Logik-Fehler
   public static void main(String[] args) {
    // Statements & Expressions 
    // Statement ist Handlungsanweisung - erkennen wir durch semikolon ;
    // Expression ist ein Wert ODER alles was zu einem Wert führt
    System.out.println("Hello" + " " + "World" + "!"); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[0]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[1]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[2]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[3]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[4]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[5]); // println text ausgeben und danach new line (Zeilenumbruch)
    System.out.println("Hello" + " " + args[6]); // println text ausgeben und danach new line (Zeilenumbruch)
   }
}
