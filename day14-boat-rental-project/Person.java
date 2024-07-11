public class Person {
    private String name;
    private boolean hasLicence;

    public Person(String name, boolean hasLicence) {
        this.name = name;
        this.hasLicence = hasLicence;
    }

    public String getName() {
        return this.name;
    }
    public boolean hasLicence() {
        return this.hasLicence;
    }
}
