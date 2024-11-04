package LMS;

public class Librarian extends Person{
    private final String employee_id;
    private final Library library;

    public Librarian(String name, String employee_id) {
        super(name);
        this.employee_id = employee_id;
        library = new Library();
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
