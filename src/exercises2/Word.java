package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    public static void getWord(ArrayList<String> words) {
        for (String word : words) {
            if(word.length() == 5)
                System.out.println(word);
            }
        }
    }

