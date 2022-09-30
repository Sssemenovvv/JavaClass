package w3;

public class TestClass {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Метод класса Circle(переопределен)
        System.out.println(s1.getArea()); // Метод класса Circle(переопределен)
        System.out.println(s1.getPerimeter()); // Метод класса Circle(переопределен)
        System.out.println(s1.getColor()); // Метод класса Shape
        System.out.println(s1.isFilled());// Метод класса Shape
        // System.out.println(s1.getRadius());
        // Не работает, потому что в классе Shape нет метода getRadius

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); /// Метод класса Circle(переопределен)
        System.out.println(c1.getArea()); // Метод класса Circle(переопределен)
        System.out.println(c1.getPerimeter()); // Метод класса Circle(переопределен)
        System.out.println(c1.getColor()); // Метод класса Shape
        System.out.println(c1.isFilled()); // Метод класса Shape
        System.out.println(c1.getRadius()); // Метод класса Circle, получен доступ ко всем методам класса

        //Shape s2 = new Shape();
        // Мы не можем создавать экземпляр абстрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); //Метод класса Rectangle(переопределен)
        System.out.println(s3.getArea()); // Метод класса Rectangle(переопределен)
        System.out.println(s3.getPerimeter()); // Метод класса Rectangle(переопределен)
        System.out.println(s3.getColor()); // Метод класса Shape
        // System.out.println(s3.getLength());
        // В классе Shape нет метода getLength

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1); //Метод класса Rectangle(переопределен)
        System.out.println(r1.getArea()); // Метод класса Rectangle(переопределен)
        System.out.println(r1.getColor()); // Метод класса Shape
        System.out.println(r1.getLength()); // Метод класса Rectangle, получен доступ ко всем методам класса

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // Метод класса Square(переопределен)
        System.out.println(s4.getArea()); // Метод класса Square(переопределен)
        System.out.println(s4.getColor()); // Метод класса Shape
        // System.out.println(s4.getSide());
        // В классе Shape нет метода getSide()

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); // Метод класса Square(переопределен)
        System.out.println(r2.getArea()); // Метод класса Square(переопределен)
        System.out.println(r2.getColor()); // Метод класса Shape
        // System.out.println(r2.getSide());
        // В классе Rectangle нет метода getSide()
        System.out.println(r2.getLength()); // Метод класса Rectangle

        Square sq1 = (Square)r2;// Downcast Rectangle r2 to Square
        System.out.println(sq1); //Метод класса Square(переопределен)
        System.out.println(sq1.getArea()); // Метод класса Square(переопределен)
        System.out.println(sq1.getColor()); // Метод класса Shape
        System.out.println(sq1.getSide()); //Метод класса Square, получен доступ ко всем методам класса
        System.out.println(sq1.getLength()); // Метод класса Rectangle
    }
}
