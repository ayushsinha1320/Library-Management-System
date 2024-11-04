package LMS;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books;
    private final Map<String, Member> members;

    public Library() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
    }

    public Library(Map<String, Book> books, Map<String,Member> members) {
        this.books = new HashMap<>(books);
        this.members = new HashMap<>(members);
    }

    public Map<String, Book> getBooks(){
        return books;
    }

    public void register_member(Member member){
        members.put(member.getMember_id(),member);
    }

    public boolean issue_book(String member_id,String book_isbn){
        Member member = members.get(member_id);
        Book book = books.get(book_isbn);

        if(book != null && book.is_available()) {
            book.borrow_book();
            member.borrow_book(book);
            return true;
        }else{
            return false;
        }
    }

    public boolean receive_book(String member_id,String book_isbn){
        Member member = members.get(member_id);
        Book book = books.get(book_isbn);

        if(book != null && book.is_available()){
            book.return_book();
            member.return_book(book);
            return true;
        }else{
            return false;
        }
    }

    public void list_all_books(){
        for(Book book : books.values()) {
            System.out.println(book.get_details());
        }
    }

}
