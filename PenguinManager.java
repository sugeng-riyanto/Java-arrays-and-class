// Import ArrayList class from the Java Collections framework
import java.util.ArrayList;

// Main class to manage penguins
public class PenguinManager {

    // Main method where the program execution starts
    public static void main(String[] args) {
        // Step 1: Initialize a list of penguins
        ArrayList<Penguin> penguins = initializePenguins();

        // Step 2: Print all penguins in the list
        System.out.println("All Penguins:");
        printAllPenguins(penguins);

        // Step 3: Edit details of a specific penguin
        System.out.println("\nEditing a Penguin:");
        editPenguin(penguins, "Pingo", 6, 12.5); // Edit Pingo's details

        // Step 4: Print all penguins after editing
        System.out.println("\nPenguins after editing:");
        printAllPenguins(penguins);

        // Step 5: Remove a penguin from the list
        System.out.println("\nRemoving a Penguin:");
        removePenguin(penguins, "Lolo"); // Remove Lolo from the list

        // Step 6: Print all penguins after removal
        System.out.println("\nPenguins after removal:");
        printAllPenguins(penguins);
    }

    // Method to initialize and create a list of penguins
    public static ArrayList<Penguin> initializePenguins() {
        // Create an ArrayList to hold Penguin objects
        ArrayList<Penguin> penguins = new ArrayList<>();

        // Add Penguin objects to the list
        penguins.add(new Penguin("Pingo", "Emperor", 5, 10.2));  // Add Pingo
        penguins.add(new Penguin("Lolo", "Rockhopper", 3, 8.3)); // Add Lolo
        penguins.add(new Penguin("Mimi", "Chinstrap", 4, 9.7));  // Add Mimi
        penguins.add(new Penguin("Kiki", "Adélie", 6, 11.1));    // Add Kiki
        penguins.add(new Penguin("Bobo", "Gentoo", 2, 7.8));     // Add Bobo

        // Return the list of penguins
        return penguins;
    }

    // Method to print details of all penguins in the list
    public static void printAllPenguins(ArrayList<Penguin> penguins) {
        // Loop through each penguin and call the printPenguin method
        for (Penguin penguin : penguins) {
            penguin.printPenguin(); // Print details of the current penguin
        }
    }

    // Method to edit the details of a specific penguin
    public static void editPenguin(ArrayList<Penguin> penguins, String name, int newAge, double newWeight) {
        // Loop through the list of penguins
        for (Penguin penguin : penguins) {
            // Check if the penguin's name matches the given name
            if (penguin.getName().equals(name)) {
                penguin.editPenguin(name, newAge, newWeight); // Update the penguin's details
                return; // Exit the method after editing
            }
        }

        // Print a message if the penguin is not found
        System.out.println("Penguin with name " + name + " not found.");
    }

    // Method to remove a penguin from the list
    public static void removePenguin(ArrayList<Penguin> penguins, String name) {
        // Use the removeIf method to remove penguins with the given name
        penguins.removeIf(penguin -> penguin.getName().equals(name));
        System.out.println("Removed Penguin with name " + name + ".");
    }
}
