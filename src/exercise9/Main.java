package exercise9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        fillMatrix(matrix);
        show(matrix);
        String largestRow = findLargestRow(matrix).toString();
        largestRow = largestRow.substring(1, largestRow.length() - 1);
        System.out.println("The largest row index: " + largestRow);

        String largestColumn = findLargestColumn(matrix).toString();
        largestColumn = largestColumn.substring(1, largestColumn.length() - 1);
        System.out.println("The largest column index: " + largestColumn);

    }

    private static void fillMatrix(int[][] matrix) {
        Random generator = new Random();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = generator.nextInt(2);
    }

    private static ArrayList<Integer> findLargestRow(int[][] matrix) {
        int maximumSumOfRow = 0;
        for (int[] ints : matrix) {
            int totalInRow = 0;
            for (int anInt : ints) {
                if (anInt == 1)
                    totalInRow++;
            }
            if (totalInRow > maximumSumOfRow)
                maximumSumOfRow = totalInRow;
        }
        ArrayList<Integer> maximumRows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int totalInRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    totalInRow++;
            }
            if (totalInRow == maximumSumOfRow)
                maximumRows.add(i);
        }
        return maximumRows;
    }

    private static ArrayList<Integer> findLargestColumn(int[][] matrix) {
        int maximumSumOfColumn = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int totalInColumn = 0;
            for (int[] ints : matrix) {
                if (ints[i] == 1)
                    totalInColumn++;
            }
            if (totalInColumn > maximumSumOfColumn)
                maximumSumOfColumn = totalInColumn;
        }
        ArrayList<Integer> maximumColumn = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int totalInRow = 0;
            for (int[] ints : matrix) {
                if (ints[i] == 1)
                    totalInRow++;
            }
            if (totalInRow == maximumSumOfColumn)
                maximumColumn.add(i);
        }
        return maximumColumn;
    }

    private static void show(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
