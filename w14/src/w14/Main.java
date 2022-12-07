package w14;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();

        client.sit();

        client.setChair(chairFactory.createMagicanChair());
        ((MagicChair) client.chair).doMagic();

        client.setChair(chairFactory.createFunctionalChair());
        System.out.println(((FunctionalChair) client.chair).sum(1, 8));

        client.setChair(chairFactory.createVictorianChair());
    }
}
