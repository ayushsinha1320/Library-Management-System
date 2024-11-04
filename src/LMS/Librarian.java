package LMS;

public class Librarian {
    private final String name;
    private final String employee_id;

    public Librarian(String name, String employee_id) {
        this.name = name;
        this.employee_id = employee_id;
    }

    public Librarian() {
        name = "NO NAME PROVIDED";
        employee_id = "NO EMPLOYEE_ID PROVIDED";
    }
}
