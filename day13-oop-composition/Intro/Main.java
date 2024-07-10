package Intro;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Baum lb1 = new Baum(3.4, 0.6, false);
        Baum lb2 = new Baum(3.9, 1.02, false);
        Baum lb3 = new Baum(2.8, 0.62, false);
        Baum lb4 = new Baum(2.4, 0.49, false);
        Baum lb5 = new Baum(2.8, 0.56, false);
        
        Baum nb1 = new Baum(1.2, 0.10, true);

        Wald wald = new Wald("Laubwald");
        wald.addBaum(lb1);
        wald.addBaum(lb2);
        wald.addBaum(lb3);
        wald.addBaum(lb4);
        wald.addBaum(lb5);
        wald.addBaum(nb1);
        System.out.println("Der Wald '" + wald.getName() + "' hat " + wald.getWoodInQubicMeter() + "m^3 holz");
        
        ArrayList<Baum> baumListe = new ArrayList<>(List.of(lb1, lb2, lb3, lb4));
        Wald nachbarWald = new Wald("Laubwald vom Nachbar", baumListe);
        System.out.println("Der Wald '" + nachbarWald.getName() + "' hat " + nachbarWald.getWoodInQubicMeter() + "m^3 holz");
    }
}
