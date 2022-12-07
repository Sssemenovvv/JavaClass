package w14;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Садится на стул");
    }


    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
