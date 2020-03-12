package exercise1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        Triangle my = new Triangle(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.print("Enter color: ");
        my.setColor(input.next());
        System.out.print("Is filled?(y,n): ");
        my.setFilled(input.next().charAt(0) != 'n');

        System.out.println("Area = " + my.getArea());
        System.out.println("Perimeter = " + my.getPerimeter());
        System.out.println("Color: " + my.getColor());
        System.out.println("Filled: " + my.isFilled());
    }
}
