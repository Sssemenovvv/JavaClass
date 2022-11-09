package w21;

public class Mp3Player implements Priceable{
    private int price;

    public Mp3Player(int price) {
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
