import java.util.ArrayList;

public class PenguinManager {
    public static void main(String[] args) {
        ArrayList<Penguin> penguins = initializePenguins();
        System.out.println("All Penguins:");
        printAllPenguins(penguins);

        System.out.println("\nEditing a Penguin:");
        editPenguin(penguins, "Pingo", 6, 12.5);

        System.out.println("\nPenguins after editing:");
        printAllPenguins(penguins);

        System.out.println("\nRemoving a Penguin:");
        removePenguin(penguins, "Lolo");

        System.out.println("\nPenguins after removal:");
        printAllPenguins(penguins);
    }

    // Initialize the list of Penguins
    public static ArrayList<Penguin> initializePenguins() {
        ArrayList<Penguin> penguins = new ArrayList<>();
        penguins.add(new Penguin("Pingo", "Emperor", 5, 10.2));
        penguins.add(new Penguin("Lolo", "Rockhopper", 3, 8.3));
        penguins.add(new Penguin("Mimi", "Chinstrap", 4, 9.7));
        penguins.add(new Penguin("Kiki", "Adélie", 6, 11.1));
        penguins.add(new Penguin("Bobo", "Gentoo", 2, 7.8));
        return penguins;
    }

    // Print all Penguins
    public static void printAllPenguins(ArrayList<Penguin> penguins) {
        for (Penguin penguin : penguins) {
            penguin.printPenguin();
        }
    }

    // Edit a Penguin's details
    public static void editPenguin(ArrayList<Penguin> penguins, String name, int newAge, double newWeight) {
        for (Penguin penguin : penguins) {
            if (penguin.getName().equals(name)) {
                penguin.editPenguin(name, newAge, newWeight);
                return;
            }
        }
        System.out.println("Penguin with name " + name + " not found.");
    }

    // Remove a Penguin
    public static void removePenguin(ArrayList<Penguin> penguins, String name) {
        penguins.removeIf(penguin -> penguin.getName().equals(name));
        System.out.println("Removed Penguin with name " + name + ".");
    }
}
