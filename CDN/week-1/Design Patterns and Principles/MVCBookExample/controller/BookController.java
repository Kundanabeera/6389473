package controller;

import model.Book;
import view.BookView;

public class BookController {
    private Book book;
    private BookView view;

    public BookController(Book book, BookView view) {
        this.book = book;
        this.view = view;
    }

    public void updateBookFromUserInput() {
        book.setTitle(view.promptTitle());
        book.setAuthor(view.promptAuthor());
        book.setIsbn(view.promptIsbn());
    }

    public void displayBook() {
        view.displayBookDetails(book);
    }
}
