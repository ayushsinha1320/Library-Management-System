package LMS;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final String member_id;
    private List<Book> Books= new ArrayList<Book>();

    public Member() {
        name = "NO NAME PROVIDED";
        member_id = "NIL";
    }

    public Member(String name, String member_id, List<Book> books) {
        this.name = name;
        this.member_id = member_id;
        Books = books;
    }
}
