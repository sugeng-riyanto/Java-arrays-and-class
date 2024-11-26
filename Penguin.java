public class Penguin {
    private String name;
    private String species;
    private int age;
    private double weight;

    // Constructor
    public Penguin(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // Method to print penguin details
    public void printPenguin() {
        System.out.println("Name: " + name + ", Species: " + species + ", Age: " + age + ", Weight: " + weight);
    }

    // Method to edit penguin details
    public void editPenguin(String name, int newAge, double newWeight) {
        if (this.name.equals(name)) {
            this.age = newAge;
            this.weight = newWeight;
            System.out.println("Updated " + name + " successfully!");
        } else {
            System.out.println("Penguin not found.");
        }
    }

    // Getter for name (to access the name in other classes)
    public String getName() {
        return name;
    }
}
