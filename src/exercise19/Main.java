package exercise19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int numberOfObjects = input.nextInt();
        System.out.print("Enter the weights of the objects: ");
        ArrayList<Integer> weights = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++)
            weights.add(input.nextInt());

        Collections.sort(weights);
        showBoxing(makePackage(weights));

    }

    private static ArrayList<ArrayList<Integer>> makePackage(ArrayList<Integer> weight){
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        while (weight.size()!=0){
            ArrayList<Integer> temp =new ArrayList<>();
            int size =0;
            for (int i = weight.size()-1; i >=0 && size<10; i--) {
                if (size+weight.get(i)<=10){
                    size+=weight.get(i);
                    temp.add(weight.get(i));
                    weight.remove(i);
                }
            }
            output.add(temp);
        }
        return output;
    }

    private static void showBoxing(ArrayList<ArrayList<Integer>> weights){
        for (int i = 0; i < weights.size(); i++) {
            System.out.print("Container "+(i+1)+" contains objects with weight ");
            for (int j = 0; j < weights.get(i).size(); j++)
                System.out.print(weights.get(i).get(j)+" ");
            System.out.println();
        }
    }
}
