package ru.mirea.guchanova;

public class Task_7 {
    public static void findFactors(int n, int divisor) {
        if (n == 1) {
            return;
        }
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            findFactors(n / divisor, divisor);
        } else {
            findFactors(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        int n = 120;
        findFactors(n, 2);
    }
}
