package exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            numbers.add(input.nextDouble());
        System.out.println("Sum is equal "+ sum(numbers));
    }
    public static double sum(ArrayList<Double> list){
        double total = 0;
        for (Double number:list)
            total+=number;
        return total;
    }
}
