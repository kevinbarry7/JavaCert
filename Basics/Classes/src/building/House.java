package building;
import library.Book;
public class House {
    House () {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
    }
}
class StoryBook extends Book {
    public StoryBook() {
        author = "ALB";
    }

}
