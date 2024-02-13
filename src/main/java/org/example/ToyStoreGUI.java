package org.example;

import models.Toy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ToyStoreGUI {
    private ArrayList<Toy> toys;

    public ToyStoreGUI() {
        toys = new ArrayList<>();
        createAndShowGUI();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Toy Store");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton addButton = new JButton("Add Toy");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = JOptionPane.showInputDialog("Enter toy name:");
                char type = JOptionPane.showInputDialog("Enter toy type (O, 1, or 2):").charAt(0);
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter toy price:"));
                int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter toy quantity:"));
                Toy toy = new Toy(name, type, price, quantity);
                toys.add(toy);
                JOptionPane.showMessageDialog(null, "Toy added successfully!");
            }
        });

        JButton decreaseQuantityButton = new JButton("Decrease Toy Quantity");
        decreaseQuantityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = JOptionPane.showInputDialog("Enter toy name to decrease quantity:");
                for (Toy toy : toys) {
                    if (toy.getName().equals(name)) {
                        int decreaseAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity to decrease:"));
                        toy.setQuantity(toy.getQuantity() - decreaseAmount);
                        JOptionPane.showMessageDialog(null, "Toy quantity decreased successfully!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Toy not found!");
            }
        });

        JButton increaseQuantityButton = new JButton("Increase Toy Quantity");
        increaseQuantityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = JOptionPane.showInputDialog("Enter toy name to increase quantity:");
                for (Toy toy : toys) {
                    if (toy.getName().equals(name)) {
                        int increaseAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity to increase:"));
                        toy.setQuantity(toy.getQuantity() + increaseAmount);
                        JOptionPane.showMessageDialog(null, "Toy quantity increased successfully!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Toy not found!");
            }
        });

        JButton mostToysTypeButton = new JButton("Most Toys Type");
        mostToysTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int feminineCount = 0, masculineCount = 0, unisexCount = 0;
                for (Toy toy : toys) {
                    switch (toy.getType()) {
                        case 'O':
                            feminineCount += toy.getQuantity();
                            break;
                        case '1':
                            masculineCount += toy.getQuantity();
                            break;
                        case '2':
                            unisexCount += toy.getQuantity();
                            break;
                    }
                }
                char mostToysType;
                int maxCount = Math.max(Math.max(feminineCount, masculineCount), unisexCount);
                if (maxCount == feminineCount)
                    mostToysType = 'O';
                else if (maxCount == masculineCount)
                    mostToysType = '1';
                else
                    mostToysType = '2';
                JOptionPane.showMessageDialog(null, "Type with most toys: " + mostToysType);
            }
        });

        JButton leastToysTypeButton = new JButton("Least Toys Type");
        leastToysTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int feminineCount = 0, masculineCount = 0, unisexCount = 0;
                for (Toy toy : toys) {
                    switch (toy.getType()) {
                        case 'O':
                            feminineCount += toy.getQuantity();
                            break;
                        case '1':
                            masculineCount += toy.getQuantity();
                            break;
                        case '2':
                            unisexCount += toy.getQuantity();
                            break;
                    }
                }
                char leastToysType;
                int minCount = Math.min(Math.min(feminineCount, masculineCount), unisexCount);
                if (minCount == feminineCount)
                    leastToysType = 'O';
                else if (minCount == masculineCount)
                    leastToysType = '1';
                else
                    leastToysType = '2';
                JOptionPane.showMessageDialog(null, "Type with least toys: " + leastToysType);
            }
        });

        JButton toysWithValueOverButton = new JButton("Toys with Value Over");
        toysWithValueOverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double valueThreshold = Double.parseDouble(JOptionPane.showInputDialog("Enter value threshold:"));
                StringBuilder result = new StringBuilder("Toys with value over $" + valueThreshold + ":\n");
                for (Toy toy : toys) {
                    if (toy.getPrice() * toy.getQuantity() > valueThreshold) {
                        result.append(toy.getName()).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(null, result.toString());
            }
        });

        JButton sortByQuantityButton = new JButton("Sort Toys by Quantity");
        sortByQuantityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Collections.sort(toys, new Comparator<Toy>() {
                    @Override
                    public int compare(Toy o1, Toy o2) {
                        return (int) (o1.getQuantity() - o2.getQuantity());
                    }
                });
                StringBuilder result = new StringBuilder("Toys sorted by quantity:\n");
                for (Toy toy : toys) {
                    result.append(toy.getName()).append(": ").append(toy.getQuantity()).append("\n");
                }
                JOptionPane.showMessageDialog(null, result.toString());
            }
        });

        JButton countByTypeButton = new JButton("Count Toys by Type");
        countByTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int countFeminine = 0, countMasculine = 0, countUnisex = 0;
                for (Toy toy : toys) {
                    switch (toy.getType()) {
                        case 'O':
                            countFeminine++;
                            break;
                        case '1':
                            countMasculine++;
                            break;
                        case '2':
                            countUnisex++;
                            break;
                    }
                }
                String message = "Feminine: " + countFeminine + "\nMasculine: " + countMasculine + "\nUnisex: " + countUnisex;
                JOptionPane.showMessageDialog(null, message, "Count Toys by Type", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton totalCountButton = new JButton("Total Toy Count");
        totalCountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int totalCount = toys.size();
                JOptionPane.showMessageDialog(null, "Total Toy Count: " + totalCount, "Total Toy Count", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton totalValueButton = new JButton("Total Toy Value");
        totalValueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double totalValue = 0;
                for (Toy toy : toys) {
                    totalValue += toy.getPrice() * toy.getQuantity();
                }
                JOptionPane.showMessageDialog(null, "Total Toy Value: $" + totalValue, "Total Toy Value", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        panel.add(addButton);
        panel.add(decreaseQuantityButton);
        panel.add(increaseQuantityButton);
        panel.add(countByTypeButton);
        panel.add(totalCountButton);
        panel.add(totalValueButton);
        panel.add(mostToysTypeButton);
        panel.add(leastToysTypeButton);
        panel.add(toysWithValueOverButton);
        panel.add(sortByQuantityButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToyStoreGUI());
    }
}
