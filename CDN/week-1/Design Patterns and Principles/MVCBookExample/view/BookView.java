package view;

import model.Book;
import java.util.Scanner;

public class BookView {
    private Scanner scanner = new Scanner(System.in);

    public void displayBookDetails(Book book) {
        System.out.println("\nBook Details:");
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN  : " + book.getIsbn());
    }

    public String promptTitle() {
        System.out.print("Enter book title: ");
        return scanner.nextLine();
    }

    public String promptAuthor() {
        System.out.print("Enter author name: ");
        return scanner.nextLine();
    }

    public String promptIsbn() {
        System.out.print("Enter ISBN: ");
        return scanner.nextLine();
    }
}
