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
        words.add("Mommy");
        words.add("Daddy");
        words.add("Ham");
        words.add("Gel");
        words.add("Organic");

        System.out.print("Enter a word length: ");

//        for (int i = 0; i < words.size(); i++) {
//            if(wordInput.hasNextInt()){
//                Word.getWord(words);
//            }
////            String newWord = wordInput.nextLine();
////            if (!newWord.equals("") || wordInput.hasNextInt()) ;
////            words.add(newWord);
//        }
        Word.getWord(words);
    }
}
