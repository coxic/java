package ru.mirea.guchanova;

public class Task_6 {
    public static boolean isPrime(int n, int divisor) {
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
