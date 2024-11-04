package LMS;

/**
 * Main class to demonstrate the functionality of the Library Management System.
 * It includes operations like adding books, adding members, borrowing and returning of books.
 */

public class Main {
    public static void main(String[] args) {
        // Creates an instance of Library class to manage collection of books and members
        Library library = new Library();

        // Creates an instance of Librarian class to manage library operations
        Librarian librarian = new Librarian("John","J001");

        // Creating instance of Book class object with different information.
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "ISBN001", 3);
        Book book2 = new Book("Atomic Habits", "James Clear", "ISBN002", 2);

        // Librarian add books to the library inventory
        librarian.add_book(book1);
        librarian.add_book(book2);

        // Register new member with Name and Member ID in the LMS.
        Member member = new Member("Lisa", "L001");
        library.register_member(member);

        // Display the current inventory of books in the library.
        librarian.viewInventory();

        // Issue a book to the member if available.
        if (library.issue_book("L001", "ISBN001")) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }

        // Display the list of borrowed book by the member.
        member.list_borrowed_books();

        // Display the return message after returning the book
        if (library.receive_book("L001", "ISBN001")) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Return failed.");
        }

        // Display all books in the library after the return operation.
        System.out.println("All books");
        librarian.viewInventory();
    }
}
