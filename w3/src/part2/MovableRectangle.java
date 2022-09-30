package part2;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        MovablePoint tl = new MovablePoint(x1, y1, xSpeed, ySpeed);
        MovablePoint br = new MovablePoint(x2, y2, xSpeed, ySpeed);
        this.topLeft = tl;
        this.bottomRight = br;
    }

    public Boolean CheckSpeed() {
        return topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed();
    }

    public void moveUP() {
        topLeft.moveUP();
        bottomRight.moveUP();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "x1= " + topLeft.getX() + ", y1= " + topLeft.getY() + ", x2= " + bottomRight.getX() + ", y2= " + bottomRight.getY() + ", xSpeed= " + topLeft.getxSpeed() + ", ySpeed= " + topLeft.getySpeed();
    }
}