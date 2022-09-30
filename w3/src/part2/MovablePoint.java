package part2;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void moveUP() {
        this.y = y + ySpeed;
    }

    public void moveDown() {
        this.y = y - ySpeed;
    }

    public void moveLeft() {
        this.x = x - xSpeed;
    }

    public void moveRight() {
        this.x = x + xSpeed;
    }

    public String toString() {
        return "x= " + x + ", y= " + y + ", xSpeed= " + xSpeed + ", ySpeed= " + ySpeed;
    }
}
