package library;
public class Book {
    public String isbn;
    protected String author;
    public void printBook() {}
    private void countPage() {}
}
class Coursebook extends Book {
    public Coursebook() {
        author = "KFB";
    }
}