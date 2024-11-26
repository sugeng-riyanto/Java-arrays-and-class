// Define the Penguin class
public class Penguin {

    // Private attributes for the Penguin class
    private String name;    // Name of the penguin
    private String species; // Species of the penguin
    private int age;        // Age of the penguin
    private double weight;  // Weight of the penguin in kilograms

    // Constructor to initialize the Penguin object
    public Penguin(String name, String species, int age, double weight) {
        this.name = name;          // Set the name
        this.species = species;    // Set the species
        this.age = age;            // Set the age
        this.weight = weight;      // Set the weight
    }

    // Method to print details of the penguin
    public void printPenguin() {
        System.out.println("Name: " + name + ", Species: " + species + 
                           ", Age: " + age + ", Weight: " + weight);
    }

    // Method to edit the penguin's age and weight
    public void editPenguin(String name, int newAge, double newWeight) {
        // Check if the name matches this penguin's name
        if (this.name.equals(name)) {
            this.age = newAge;       // Update the age
            this.weight = newWeight; // Update the weight
            System.out.println("Updated " + name + " successfully!");
        } else {
            // Print a message if the name doesn't match
            System.out.println("Penguin not found.");
        }
    }

    // Getter method to retrieve the penguin's name
    public String getName() {
        return name; // Return the name of the penguin
    }
}
