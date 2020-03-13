package exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public Object pop() {
        return remove(size() - 1);
    }

    public Object peek() {
        return lastIndexOf(size() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
