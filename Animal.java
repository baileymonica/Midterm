public class Animal {
    private String species;

    //Constructor
    public Animal() {
        species = "";
    }
    // Custom constructor
    public Animal(String newSpecies) {
        species = newSpecies;
    }
    // Setter
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // Getter
    public String getSpecies() {
        return species;
    }

    // toString method
    public String toString() {
        return species;
    }
}
