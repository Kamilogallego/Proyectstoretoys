package ui;

import entities.Toys;
import mappers.ToyMapper;
import mappers.dtos.ToyDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ToyStore toyStore = new ToyStore();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    toyStore.addToy();
                    break;
                case 2:
                    toyStore.showToysByType();
                    break;
                case 3:
                    toyStore.showTotalToys();
                    break;
                case 4:
                    toyStore.showTotalValue();
                    break;
                case 5:
                    toyStore.decreaseStock();
                    break;
                case 6:
                    toyStore.increaseStock();
                    break;
                case 7:
                    toyStore.showMostCommonType();
                    break;
                case 8:
                    toyStore.showLeastCommonType();
                    break;
                case 9:
                    toyStore.showToysWithValueAbove();
                    break;
                case 10:
                    toyStore.sortToysByQuantity();
                    break;
                case 11:
                    System.out.println("Thank you for using the application!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please enter an option from 1 to 11.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("**Toy Store Menu**");
        System.out.println("1. Add Toy");
        System.out.println("2. Show Toys by Type");
        System.out.println("3. Show Total Toys");
        System.out.println("4. Show Total Value");
        System.out.println("5. Decrease Stock of a Toy");
        System.out.println("6. Increase Stock of a Toy");
        System.out.println("7. Show Most Common Type");
        System.out.println("8. Show Least Common Type");
        System.out.println("9. Show Toys with Value Above");
        System.out.println("10. Sort Toys by Quantity");
        System.out.println("11. Exit");
        System.out.println("Enter an option (1-11):");
    }
}

class ToyStore {
    private final ArrayList<Toys> toys = new ArrayList<>();
    private final ToyMapper toyMapper = new ToyMapper();
    private final Scanner scanner = new Scanner(System.in);

    public void addToy() {
        // Implementación sin cambios
    }

    public void showToysByType() {
        // Implementación sin cambios
    }

    public void showTotalToys() {
        // Implementación sin cambios
    }

    public void showTotalValue() {
        // Implementación sin cambios
    }

    public void decreaseStock() {
        // Implementación con pruebas unitarias como referencia
    }

    public void increaseStock() {
        // Implementación sin cambios
    }

    public void showMostCommonType() {
        // Implementación sin cambios
    }

    public void showLeastCommonType() {
        // Implementación sin cambios
    }

    public void showToysWithValueAbove() {
        // Implementación sin cambios
    }

    public void sortToysByQuantity() {
        // Implementación sin cambios
    }
}
