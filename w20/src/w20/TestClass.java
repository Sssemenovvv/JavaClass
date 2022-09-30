package w20;

public class TestClass {
    public static void main(String[] args) {
        Cup cup  = new Cup(500, "Red", "Metal",false);
        Plate plate = new Plate(800, "Brown", "ceramics", true);

        System.out.println(cup.getType());
        System.out.println(cup.getColor());
        System.out.println(cup.isClear());
        cup.wash();
        System.out.println(cup.isClear());

        System.out.println();

        System.out.println(plate.getMaterial());
        System.out.println(plate.getPrice());
        plate.crashDish();

        System.out.println();
    }
}
