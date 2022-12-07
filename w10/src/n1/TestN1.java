package n1;

public class TestN1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Anton");
        person.setOtchestvo("Sergeevi4");
        person.setSurname("Losev");
        System.out.println(person.getFIO());

        person.setName("");
        System.out.println(person.getFIO());

        person.setOtchestvo("");
        System.out.println(person.getFIO());
    }
}
