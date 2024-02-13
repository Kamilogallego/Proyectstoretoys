package org.example;


import models.Toy;
import org.example.ToyStoreGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToyStoreGUI toyStoreGUI = new ToyStoreGUI();
            toyStoreGUI.createAndShowGUI();
        });
    }
}
