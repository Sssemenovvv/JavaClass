package n1;

public class Person {
    private String name = "";
    private String surname = "";
    private String otchestvo = "";

    public Person() {
    }

    public Person(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getFIO(){
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer
                .append(name)
                .append(" ")
                .append(surname)
                .append(" ")
                .append(otchestvo);
        return stringBuffer.toString();
    }
}
