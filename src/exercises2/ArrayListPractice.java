package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("The sum of even numbers = " + Sum.getSum(numbers));

        ArrayList<String> words = new ArrayList<>();
        Scanner wordInput = new Scanner(System.in);
//        System.out.println("Enter a list of words: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word: ");
            String newWord = wordInput.nextLine();
            if (!newWord.equals("")) ;
            words.add(newWord);
        }
        Word.getWord(words);
    }
}
