package ru.mirea.guchanova;

public class Square extends GeometricObject implements Colorable {
    private double side;

    // Конструктор по умолчанию
    public Square() {
        this.side = 1;
    }

    // Конструктор с указанной стороной
    public Square(double side) {
        this.side = side;
    }

    // Метод для получения стороны
    public double getSide() {
        return side;
    }

    // Метод для установки стороны
    public void setSide(double side) {
        this.side = side;
    }

    // Площадь квадрата
    @Override
    public double getArea() {
        return side * side;
    }

    // Периметр квадрата
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Реализация метода howToColor() из интерфейса tasks_1_to_3.Colorable
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}