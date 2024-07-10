package Intro;
import java.util.ArrayList;

public class Wald {
    private String name;
    // composition
    private ArrayList<Baum> trees;
    // private Person besitzer;
    // private Person kontaktperson;

    public Wald(String name) {
        this.name = name;
        this.trees = new ArrayList<Baum>();
    }
    public Wald(String name, ArrayList<Baum> trees) {
        this.name = name;
        this.trees = trees;
    }
        
    public void addBaum(Baum newBaum) {
        this.trees.add(newBaum);
    }

    public void removeBaum(Baum baum) {
        this.trees.remove(baum);
    }
    public void removeBaum(int baumId) {
        int baumIndex = -1;
        for(int i = 0; i < trees.size(); i++) {
            boolean foundBaum = this.trees.get(i).getId() == baumId;
            if(foundBaum) {
                baumIndex = i;
                break;
            }
        }
        if(baumIndex >=0) this.trees.remove(baumIndex);
    }

    // gibt die anzahl der Bäume zurück
    // waldSize() // zB 64 (Bäume im Wald)
    public int waldSize() {
        return this.trees.size();
    }

    // waldSize(true) // zB 30 (Nadelbäume)
    // waldSize(false) // zB 34 (Laubbäume)
    public int waldSize(boolean isNadelbaum) {
        int counter = 0;
        for(int i = 0; i < trees.size(); i++) {
            if (trees.get(i).isNadelbaum() == isNadelbaum)
                counter++;
        }
        return counter;
    }

    public double getWoodInQubicMeter() {
        double totalWoodInQm = 0.0;
        for(int i = 0; i < trees.size(); i++) {
            totalWoodInQm += trees.get(i).woodInQm();
        }
        return totalWoodInQm;
    }

    public String getName() {
        return this.name;
    }
}


// Wald und Baum
// 1 Wald hat mehrere Bäume
// Wieviele Bäume ?
// Wieviele Bäume von welchem Typ?
// Wieviel cm^3 Holz ?