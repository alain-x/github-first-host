import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Name: Gasore Alain Valentin
 * Reg Number: 20554/2024
 * Class: Test
 * Description: Implements the BookMethods interface to manage books.
 * Instance: Manages the collection of books using a HashSet.
 */
class BookManager implements BookMethods {
    private Set<Book> books = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean addBook() {
        System.out.println("Enter Book Title:");
        String title = scanner.nextLine();
        System.out.println("Enter Book Author:");
        String author = scanner.nextLine();
        System.out.println("Enter Book ISBN:");
        String isbn = scanner.nextLine();

        Book newBook = new Book(title, author, isbn);
        if (books.add(newBook)) {
            System.out.println("Book added successfully.");
            return true;
        } else {
            System.out.println("Book already exists.");
            return false;
        }
    }

    @Override
    public boolean removeBook() {
        System.out.println("Enter ISBN of the book to remove:");
        String isbn = scanner.nextLine();

        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null && books.remove(bookToRemove)) {
            System.out.println("Book removed successfully.");
            return true;
        } else {
            System.out.println("Book not found.");
            return false;
        }
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
