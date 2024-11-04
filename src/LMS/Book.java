package LMS;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private int copies;

    public Book() {
        title = "NO TITLE PROVIDED";
        author = "NO AUTHOR NAME PROVIDED";
        ISBN = "NO ISBN";
        copies = 0;
    }


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
        }else{
            System.out.println("No copies available");
        }
    }

    public void return_book(){
        copies++;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
