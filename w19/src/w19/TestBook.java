package w19;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter");
        Book book2 = new Book("HarryPotter","1997");
        Book book3 = new Book("HarryPotter","1997",30);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1.setTitle("Another title");
        book2.setYearsOfWriting("another year");
        book3.turnThePage();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
