package ru.mirea.guchanova;
import javax.swing.*;
import java.awt.*;
public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Привет МИР!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 182, 193));
        frame.add(panel, BorderLayout.CENTER);

        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);

        frame.setVisible(true);
    }
}
