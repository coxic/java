package ru.mirea.guchanova;

public class Seasonstest {
    public static void main(String[] args) {
        Season season = Season.Autumn;
        System.out.println(season);
        info(season);
        printAll();
    }
    public static void info(Season season) {
        switch (season) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я местами люблю осень");
                break;
            case Winter:
                System.out.println("Я не люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
        }
    }

    public static void printAll(){
        for (Season s : Season.values()) {
            System.out.println(s + " - " + s.getDescription());
        }
    }

}

