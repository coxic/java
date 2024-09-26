package ru.mirea.guchanova;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }
    public void moveUp(){
        this.center.moveUp();
    }
    public void moveDown(){
        this.center.moveDown();
    }
    public void moveLeft(){
        this.center.moveLeft();
    }
    public void moveRight(){
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return "UIBO0122.pavlov.MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
