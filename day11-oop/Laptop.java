// Laptop
// -----------
// String hersteller;
// float cpuHz; // 3.2f ==> 3.2 GHz
// byte ram;  // zb 16 => 16GB
// int diskSpace; // 512 => 512 GB
// float monitorSize; // 15.6 ==> 15.6"
// float weight; // 1.48 ==> 1.48 kg

// Aufgabe:
// implementiere die Laptop klasse mit einem konstruktor der alle werde akzeptiert
// implementiere getter und setter (attr sind private)
//      baue checks ein beim setten (selber überlegen)
//      hersteller nur "Apple", "Samsung", "Toshiba", "Acer", "HP", "Dell"
// implementiere eine toString methode
// implementiere eine printInfo methode
public class Laptop {
    private String hersteller;
    private float cpuHz;
    private byte ram;
    private int diskSpace;
    private float monitorSize;
    private float weight;

    public Laptop(String hersteller, float cpuHz, byte ram, int diskSpace, float monitorSize, float weight) {
        this.setHersteller(hersteller);
        this.setCpuHz(cpuHz);
        this.setRam(ram);
        this.setDiskSpace(diskSpace);
        this.setMonitorSize(monitorSize);
        this.setWeight(weight);
    }

    public String getHersteller() {
        return this.hersteller;
    }
    public float getCpuHz() {
        return this.cpuHz;
    }
    public byte getRam() {
        return this.ram;
    }
    public int getDiskSpace() {
        return this.diskSpace;
    }
    public float getMonitorSize() {
        return this.monitorSize;
    }
    public float getWeight() {
        return this.weight;
    }
    
    public void setHersteller(String hersteller) {
        String[] herstellerListe = { "Apple", "Samsung", "Toshiba", "Acer", "HP", "Dell" };
        boolean found = false;
        for(int i = 0; i < herstellerListe.length; i++) {
            found = herstellerListe[i].equals(hersteller);
            if(found) break;
        }

        if(!found) this.hersteller = "Apple";
        else this.hersteller = hersteller;
    }
    public void setCpuHz(float cpuHz) {
        this.cpuHz = cpuHz;
    }
    public void setRam(byte ram) {
        this.ram = ram;
    }
    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }
    public void setMonitorSize(float monitorSize) {
        this.monitorSize = monitorSize;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.hersteller + " " + this.cpuHz + " GHz" + this.ram + " GB" + this.diskSpace + " GB" + monitorSize + "\"" + weight + " kg";
    }

    public void printInfo() {
        System.out.println(this.toString());
    }
}
