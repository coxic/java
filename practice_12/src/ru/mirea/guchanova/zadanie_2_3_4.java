package ru.mirea.guchanova;

import java.util.Scanner;

public class zadanie_2_3_4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("Не являеется число/ целым числом");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } finally {
            System.out.println("Программа завершена");
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        zadanie_2_3_4 example = new zadanie_2_3_4();
        example.exceptionDemo();
    }
}
