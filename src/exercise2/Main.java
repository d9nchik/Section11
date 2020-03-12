package exercise2;

public class Main {
    public static void main(String[] args) {
        Person dan = new Person("dan", "Arzeuliva 15, 123", "+3809654816525", "dan.galaiko@gmail.com");

        Student andrew = new Student(Student.SOPHOMORE);
        andrew.setEmailAddress("andrew@gmail.com");
        andrew.setName("andrew");
        andrew.setAddress("Kiev");
        andrew.setPhoneNumber("+1234567890");

        Employee igor = new Employee("igor","Kiev","+3800000000","matan@kpi.ua","KPI 18", 5000, new MyDate());
        Faculty irina = new Faculty("irina", "Kiev", "+380669645931", "proga@in.ua", "KPI 7", 10000, new MyDate(), 10,"Highest of ASOIU");
        Staff bathMan = new Staff("bath", "near Kiev", "without", "not using", "KPI 18", 1000, new MyDate(), "Fix everything");

        System.out.println(dan);
        System.out.println(andrew);
        System.out.println(igor);
        System.out.println(irina);
        System.out.println(bathMan);
    }


}
