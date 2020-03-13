package exercise6;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> my = new ArrayList<>();
        my.add(new Loan());
        my.add(new Date());
        my.add(new Circle());
        for (Object o : my)
            System.out.println(o.toString());
    }
}
