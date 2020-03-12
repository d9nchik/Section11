package exercise2;

public class Faculty extends Employee{
    private int hours =0;
    private String rank="";

    public Faculty() {
    }

    public Faculty(int hours, String rank) {
        this.hours = hours;
        this.rank = rank;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, int hours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty "+getName();
    }
}
