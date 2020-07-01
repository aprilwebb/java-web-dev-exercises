package exercises.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    public static void getWord(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();

            for (String word : words) {
                if (word.length() == search) {
                    System.out.println(word);
            }
        }
    }
}


