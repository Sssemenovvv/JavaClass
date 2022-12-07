package n1;

public class TelephoneTest {
    public static void main(String[] args) {
        Telephone phoneNumber1 = new Telephone("+125215224525");
        System.out.println(phoneNumber1.getPhoneNumber());

        Telephone phoneNumber2 = new Telephone("+73525865523");
        System.out.println(phoneNumber2.getPhoneNumber());

        Telephone phoneNumber3 = new Telephone("89169161240");
        System.out.println(phoneNumber3.getPhoneNumber());
    }
}
