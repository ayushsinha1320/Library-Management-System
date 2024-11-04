package LMS;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("John","J001");

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "ISBN001", 3);
        Book book2 = new Book("Atomic Habits", "James Clear", "ISBN002", 2);

        librarian.add_book(book1);
        librarian.add_book(book2);

        Member member = new Member("Lisa", "L001");
        library.register_member(member);

        librarian.viewInventory();

        if (library.issue_book("L001", "ISBN001")) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }

        member.list_borrowed_books();

        if (library.receive_book("L001", "ISBN001")) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Return failed.");
        }

        System.out.println("All books");
        librarian.viewInventory();
    }
}
