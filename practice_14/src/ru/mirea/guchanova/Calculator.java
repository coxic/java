package ru.mirea.guchanova;

import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame {
    JTextField number1Field = new JTextField(10);
    JTextField number2Field = new JTextField(10);
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("×");
    JButton divideButton = new JButton("÷");

    Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Первое число:"));
        add(number1Field);
        add(new JLabel("Второе число:"));
        add(number2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        addButton.addActionListener(e -> performOperation("+"));
        subtractButton.addActionListener(e -> performOperation("-"));
        multiplyButton.addActionListener(e -> performOperation("×"));
        divideButton.addActionListener(e -> performOperation("÷"));

        setVisible(true);
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(number1Field.getText().trim());
            double num2 = Double.parseDouble(number2Field.getText().trim());
            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "×":
                    result = num1 * num2;
                    break;
                case "÷":
                    if (num2 == 0) {
                        throw new ArithmeticException("На ноль делить нельзя");
                    }
                    result = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "Результат = " + result, "Ответ", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Введите числа", "ОШИБКА", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}