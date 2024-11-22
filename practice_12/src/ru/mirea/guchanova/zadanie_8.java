package ru.mirea.guchanova;
import java.util.Scanner;

public class zadanie_8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Kлюч: ");
                String key = myScanner.nextLine();
                if (key.isEmpty()) {
                    throw new Exception("null ключ");
                }
                System.out.println("Данные ключа: " + key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте еще раз");
            }
        }
        myScanner.close();
    }

    public static void main(String[] args) {
        ru.mirea.guchanova.zadanie_8 demo = new ru.mirea.guchanova.zadanie_8();
        demo.getKey();
    }
}
