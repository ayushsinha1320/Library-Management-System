package LMS;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private int copies;

    public Book(String title, String author, String ISBN, int copies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copies = copies;
    }

    public String get_details(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

    public boolean is_available(){
        return (copies > 0);
    }

    public void borrow_book(){
        if(copies > 0){
            copies--;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void return_book(){
        copies++;
    }
}
