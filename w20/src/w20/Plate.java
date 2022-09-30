package w20;

public class Plate extends Dish {
    private String type = "Plate";


    public Plate(int price, String color, String material, boolean isClear) {
        super(price, color, material, isClear);
    }

    public String getType() {
        return type;
    }

    public void wash() {
        System.out.println("The plate is washed!!!");
        setClear(true);
    }

    public void crashDish() {
        System.out.println("The plate is crashed!!!");
    }
}
