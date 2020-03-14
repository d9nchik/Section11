package exercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            numbers.add(input.nextInt());
        sort(numbers);
        System.out.print("Result of sorting: ");
        for (Integer number : numbers) System.out.print(number+" ");
        System.out.println();
    }

    public static void sort(ArrayList<Integer> list) {
        for (int inc = list.size() / 2; inc >= 1; inc = inc / 2)
            for (int step = 0; step < inc; step++)
                insertionSort(list, step, inc);
    }

    private static void insertionSort(ArrayList<Integer> arr, int start, int inc) {
        Integer tmp;
        for (int i = start; i < arr.size() - 1; i += inc)
            for (int j = Math.min(i + inc, arr.size() - 1); j - inc >= 0; j = j - inc)
                if (arr.get(j - inc) > arr.get(j)) {
                    tmp = arr.get(j);
                    arr.set(j, arr.get(j - inc));
                    arr.set(j - inc, tmp);
                } else break;
    }
}
