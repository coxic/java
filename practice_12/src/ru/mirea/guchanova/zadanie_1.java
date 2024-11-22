package ru.mirea.guchanova;

public class zadanie_1 {

        public void exceptionDemo() {
            try {
                System.out.println(2 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }
        }

        public static void main(String[] args) {
            zadanie_1 example = new zadanie_1();
            example.exceptionDemo();
        }
}
