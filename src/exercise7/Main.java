package exercise7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void shuffle(ArrayList<Integer> list) {
        Random numbers = new Random();
        for (int i = 0; i < list.size(); i++) {
            int shuffleNumber = numbers.nextInt(list.size());
            Integer temp = list.get(i);
            list.set(i, list.get(shuffleNumber));
            list.set(shuffleNumber, temp);
        }
    }
}
