package ru.mirea.guchanova;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(6.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(8.0);
        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Самый большой из 2-ух кругов .ComparableCircle: " + largestComparableCircle);
        ComparableCircle circle = new ComparableCircle(8.0);
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Самый большой объект между кругом и прямоугольником: " + largestShape);
    }
}