package LMS;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person{
    private final String member_id;
    private final List<Book> borrowed_books;

    @Override
    public String get_details(){
        return "Name: " + name + " Member ID: " + member_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public Member(String name, String member_id, List<Book> books) {
        super(name);
        this.member_id = member_id;
        borrowed_books = books;
    }
    public Member(String name, String member_id) {
        super(name);
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
