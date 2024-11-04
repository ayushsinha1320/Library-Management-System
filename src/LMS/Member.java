package LMS;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final String member_id;
    private List<Book> borrowed_books;

    public String getMember_id() {
        return member_id;
    }

    public Member() {
        name = "NO NAME PROVIDED";
        member_id = "NIL";
    }

    public Member(String name, String member_id, List<Book> books) {
        this.name = name;
        this.member_id = member_id;
        borrowed_books = books;
    }
    public Member(String name, String member_id) {
        this.name = name;
        this.member_id = member_id;
        this.borrowed_books = new ArrayList<>();
    }

    public void borrow_book(Book book){
        borrowed_books.add(book);
    }

    public void return_book(Book book){
        if (borrowed_books.contains(book)) {
            borrowed_books.remove(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    public void list_borrowed_books(){
        for(Book book: borrowed_books){
            System.out.println(book.get_details());
        }
    }
}
