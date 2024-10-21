package ru.mirea.guchanova;

import javax.swing.*;

public class Image extends JFrame {

    public Image(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);
        add(label);
    }

    public static void main(String[] args) {

        String imagePath = "/Users/HP/Documents/stich.jpg";

        SwingUtilities.invokeLater(() -> {
            Image frame = new Image(imagePath);
            frame.setVisible(true);
        });
    }
}

