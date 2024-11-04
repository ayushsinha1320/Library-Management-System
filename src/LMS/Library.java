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

}
