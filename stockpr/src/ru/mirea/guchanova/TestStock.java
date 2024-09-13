package ru.mirea.guchanova;

public class TestStock {
    public static void main(String[] args) {
        Stock Stock1 = new Stock("ПАО Сбербанк", "SBER", 281.5, 282.87);
        System.out.println("Процент изменения стоимости акций равен " + Stock1.getChangePercent() + "%");
    }
}
