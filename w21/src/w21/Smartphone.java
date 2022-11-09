package w21;

public class Smartphone implements Priceable{
    private int price;

    public Smartphone(int price) {
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
