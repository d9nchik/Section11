package exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            numbers.add(input.nextInt());
        removeDuplicate(numbers);
        System.out.print("The distinct integers are ");
        for (Integer number : numbers) System.out.print(number+" ");
        System.out.println();
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        int counter = 0;
        while (counter < list.size() - 1) {
            while (list.lastIndexOf(list.get(counter)) != counter) {
                list.remove(list.lastIndexOf(list.get(counter)));
            }
            counter++;
        }
    }
}
