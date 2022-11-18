package Book;

public class Book {
    String title;
    String author;
    public void show() {
        System.out.println(title + "의 저자는 " + author);
    }

    public Book() {
        this(" ", " ");
    }
    public Book(String t) {
        title = t; author = "작자미상";
    }
    public Book(String t, String a) {
        title = t; author = a;
    }
}
