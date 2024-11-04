package LMS;

public class Librarian {
    private final String name;
    private final String employee_id;
    private Library library;

    public Librarian(String name, String employee_id) {
        this.name = name;
        this.employee_id = employee_id;
        library = new Library();
    }

    public Librarian() {
        name = "NO NAME PROVIDED";
        employee_id = "NO EMPLOYEE_ID PROVIDED";
    }

    public void add_book(Book book){
        library.getBooks().put(book.getISBN(), book);
    }

    public void remove_book(Book book) {
        library.getBooks().remove(book.getISBN());
    }

    public void viewInventory() {
        library.list_all_books();
    }
}
