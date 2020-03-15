package exercise17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        ArrayList<Integer> factors = getFactors(m);
        removeDuplicate(factors);
        int n = multiply(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + m * n);
    }

    private static ArrayList<Integer> getFactors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int counter = 2;
        while (m != 1) {
            if (m % counter == 0) {
                factors.add(counter);
                m /= counter;
            } else
                counter++;
        }
        return factors;
    }

    private static void removeDuplicate(ArrayList<Integer> list) {
        int counter = 0;
        while (counter < list.size() - 1) {
            if (list.lastIndexOf(list.get(counter)) != counter) {
                list.remove(list.lastIndexOf(list.get(counter)));
                list.remove(counter);
            } else
                counter++;
        }
    }

    public static int multiply(ArrayList<Integer> list) {
        int total = 1;
        for (Integer number : list)
            total *= number;
        return total;
    }
}
