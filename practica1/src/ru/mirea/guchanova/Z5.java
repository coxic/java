package ru.mirea.guchanova;
import java.util.Scanner;
public class Z5 {
    public static int calculatef (int y){
        int x = 1;
        for(int i = 1; i <= y; i++){
            x *= i;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = calculatef(n);
        System.out.println("Факториал числа " + n + " равен " + f);
    }
}
