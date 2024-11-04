package LMS;

public class Person {
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public String get_details(){
        return "Name: " + name;
    }
}
