import controller.BookController;
import model.Book;
import view.BookView;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        BookView view = new BookView();
        BookController controller = new BookController(book, view);

        System.out.println("=== Book Management System ===");
        controller.updateBookFromUserInput();  // User inputs
        controller.displayBook();              // Display book info
    }
}
