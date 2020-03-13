package exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack stackOfString = new MyStack();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter "+(i+1)+"-d string: ");
            stackOfString.add(input.nextLine());
        }

        while (stackOfString.size()!=0){
            System.out.println(stackOfString.pop());
        }
    }
}
