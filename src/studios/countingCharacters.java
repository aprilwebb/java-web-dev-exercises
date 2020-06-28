package studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
//        String quote = "If the product of two terms is zero then common sense says at least one of the two" +
//                "terms has to be zero to start with. So if you move all the terms over to one side, you can put" +
//                "the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                "Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashMap<Character, Integer> count = new HashMap<>();
        char[] characters = word.toCharArray();

        for (char c : characters) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

