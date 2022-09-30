package w20;

public class Cup extends Dish{
    private String type = "Cup";


    public Cup(int price, String color, String material, boolean isClear) {
        super(price, color, material, isClear);
    }

    public String getType() {
        return type;
    }

    public void wash() {
        System.out.println("The cup is washed!!!");
        setClear(true);
    }

    public void crashDish() {
        System.out.println("The cup is crashed!!!");
    }
}
