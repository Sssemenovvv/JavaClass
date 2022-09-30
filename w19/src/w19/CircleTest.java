package w19;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle);
        circle.setRadius(10);
        circle.setColor("Black");
        circle.setCoordX(10);
        circle.setCoordY(-10);
        System.out.println(circle);
    }
}
