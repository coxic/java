package ru.mirea.guchanova;

public class TestGeometricObject4_5 {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(7);
        GeometricObject geoObject2 = new Rectangle(7, 5);

        System.out.println("У двух фигур одинаковая площадь?? " + equalArea(geoObject1, geoObject2));
        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
    }


    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("Площадь = " + object.getArea());
        System.out.println("Периметр = " + object.getPerimeter());
    }
}