package ru.mirea.guchanova;
import javax.swing.*;
import java.awt.*;
public class App3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Изображения с подписями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(2, 2));


        ImageIcon icon1 = new ImageIcon("C:/Users/HP/Pictures/Saved Pictures/1.jpg");
        Image img1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(img1);

        ImageIcon icon2 = new ImageIcon("C:/Users/HP/Pictures/Saved Pictures/2.jpg");
        Image img2 = icon2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(img2);

        ImageIcon icon3 = new ImageIcon("C:/Users/HP/Pictures/Saved Pictures/3.jpg");
        Image img3 = icon3.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(img3);

        ImageIcon icon4 = new ImageIcon("C:/Users/HP/Pictures/Saved Pictures/4.jpg");
        Image img4 = icon4.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(img4);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        JLabel label1 = new JLabel(icon1);
        JLabel caption1 = new JLabel("Злой Стич", JLabel.CENTER);
        panel1.add(label1, BorderLayout.CENTER);
        panel1.add(caption1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        JLabel label2 = new JLabel(icon2);
        JLabel caption2 = new JLabel("Грустный Стич", JLabel.CENTER);
        panel2.add(label2, BorderLayout.CENTER);
        panel2.add(caption2, BorderLayout.SOUTH);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        JLabel label3 = new JLabel(icon3);
        JLabel caption3 = new JLabel("Умиротворенный Стич", JLabel.CENTER);
        panel3.add(label3, BorderLayout.CENTER);
        panel3.add(caption3, BorderLayout.SOUTH);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout());
        JLabel label4 = new JLabel(icon4);
        JLabel caption4 = new JLabel("Я, Мама и Брат", JLabel.CENTER);
        panel4.add(label4, BorderLayout.CENTER);
        panel4.add(caption4, BorderLayout.SOUTH);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        frame.setVisible(true);
    }
}
