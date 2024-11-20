package ru.mirea.guchanova;

public class TestSumArea {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle(5.0),
                new Circle(7.0),
                new Rectangle(6.0, 8.0),
                new Rectangle(4.0, 5.4)
        };

        double totalArea = GeometricObject.sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }
}
