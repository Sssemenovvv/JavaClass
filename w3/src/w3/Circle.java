package w3;

public class Circle extends Shape{
    protected double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "shape: circle, radius: " + radius + ", color: " + color + ", filled: " + filled;
    }
}
