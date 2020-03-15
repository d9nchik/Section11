package exercise18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String output = toCharacterArray("abc").toString();
        output = output.substring(1, output.length() - 1);
        System.out.println("Letters: " + output);
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> data = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            data.add(s.charAt(i));
        }
        return data;
    }
}
