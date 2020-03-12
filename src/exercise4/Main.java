package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter a sequence of numbers ending with 0: ");
        int number = input.nextInt();
        while (number != 0) {
            numbers.add(number);
            number = input.nextInt();
        }
        System.out.println("Maximum = " + max(numbers));
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (maximum < list.get(i))
                maximum = list.get(i);
        }
        return maximum;
    }
}
