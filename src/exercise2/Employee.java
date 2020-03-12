package exercise2;

public class Employee extends Person {
    private String office ="none";
    private double salary =0;
    private MyDate dateHired = new MyDate();

    public Employee(String office, double salary, MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    public MyDate getDateHired() {
        return new MyDate(dateHired.getYear(), dateHired.getMonth(), dateHired.getDay());
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee "+getName();
    }
}
