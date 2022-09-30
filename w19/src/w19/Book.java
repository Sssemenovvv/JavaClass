package w19;

public class Book {
    private String title;
    private String yearsOfWriting = "Not written";
    private int numberOfPage = 0;
    public Book(String title) {
        this.title = title;
    }
    public Book(String title, String yearsOfWriting) {
        this.title = title;
        this.yearsOfWriting = yearsOfWriting;
    }
    public Book(String title, String yearsOfWriting,  int numberOfPage) {
        this.title = title;
        this.yearsOfWriting = yearsOfWriting;
        this.numberOfPage = numberOfPage;
    }
    public String toString() {
        return "Book{" +'\n'+
                "  title = " + title + '\n' +
                "  yearsOfWriting = " + yearsOfWriting + '\n' +
                "  NumberOfPage = " + numberOfPage +'\n'+
                '}';
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYearsOfWriting() {
        return yearsOfWriting;
    }
    public void setYearsOfWriting(String yearsOfWriting) {
        this.yearsOfWriting = yearsOfWriting;
    }
    public int getNumberOfpage() {
        return numberOfPage;
    }
    public void setNumberOfpage(int numberOfpage) {
        this.numberOfPage = numberOfpage;
    }
    void turnThePage(){
        numberOfPage+=2;
    }
}
