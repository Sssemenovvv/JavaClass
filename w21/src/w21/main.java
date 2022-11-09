package w21;

public class main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(25000);
        Mp3Player mp3Player  = new Mp3Player(5000);

        System.out.println("Smartphone price: "+smartphone.getPrice());
        System.out.println("Mp3Player: "+ mp3Player.getPrice());

    }
}
