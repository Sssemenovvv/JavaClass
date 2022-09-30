package part2;

public class MovableCircle implements  Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        MovablePoint movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = movablePoint;
    }

    public void moveUP() {
        center.moveUP();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "x= " + center.getX() + ", y= " + center.getY() + ", xSpeed= " + center.getxSpeed() + ", ySpeed= " + center.getySpeed() + ", radius= " + radius;
    }
}
