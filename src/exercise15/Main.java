package exercise15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();

        System.out.print("Enter the number of points: ");
        int size = input.nextInt();

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < size; i++)
            points.add(new Point(input.nextDouble(), input.nextDouble()));
        System.out.printf("The total area is %.3f", findAreaOfPolygon(points));
    }

    public static double findAreaOfPolygon(ArrayList<Point> points) {
        double area = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            area += points.get(i).getX() * points.get(i + 1).getY();
            area -= points.get(i).getY() * points.get(i + 1).getX();
        }
        area += points.get(points.size() - 1).getX() * points.get(0).getY();
        area -= points.get(points.size() - 1).getY() * points.get(0).getX();
        return Math.abs(area) / 2;
    }
}
