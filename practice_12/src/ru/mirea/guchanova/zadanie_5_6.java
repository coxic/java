package ru.mirea.guchanova;

public class zadanie_5_6 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("ключ null в getDetails");
        }
        System.out.println("Данные ключа: " + key);
    }

    public static void main(String[] args) {
        zadanie_5_6 demo = new zadanie_5_6();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Перехват исключения: " + e.getMessage());
        }
    }
}
