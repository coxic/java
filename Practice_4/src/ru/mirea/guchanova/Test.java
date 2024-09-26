package ru.mirea.guchanova;

public class Test {
    public static void main(String[] args) {
        Movable bobik = new MovableCircle(8, new MovablePoint(12,5,10,4));
        System.out.println(bobik);
        bobik.moveLeft();
        bobik.moveUp();
        System.out.println(bobik);
    }
}
