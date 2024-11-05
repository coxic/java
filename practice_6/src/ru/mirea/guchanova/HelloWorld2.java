package ru.mirea.guchanova;
import javax.swing.*;
import java.awt.*;
public class HelloWorld2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Две панели");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(255, 228,196));
        JLabel label1 = new JLabel("Первая панель");
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setForeground(new Color(128, 0, 128));
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(144, 238, 144));
        JLabel label2 = new JLabel("Вторая панель");
        label2.setFont(new Font("Arial", Font.ITALIC, 20));
        label2.setForeground(new Color(255, 69, 0));
        panel2.add(label2);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
}
