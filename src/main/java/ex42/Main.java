package ex42;

public class Main {
    private final String lName;
    private final String fName;
    private final int salary;

    public Main(String lName, String fName, int salary) {
        this.lName = lName;
        this.fName = fName;
        this.salary = salary;
    }
    //return statements
    public String getLastName() {
        return this.lName;
    }
    public String getFirstName() {
        return this.fName;
    }
    public int getSalary() {
        return this.salary;
    }
}
