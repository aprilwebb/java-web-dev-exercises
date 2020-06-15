package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Please enter a term you'd like to search for: ");
        String found = input.next();

        if (quote.toLowerCase().contains(found.toLowerCase())) {
            System.out.println("Your term was found and it's index is " + quote.indexOf(found) +
                    " and it's length is " + found.length());
            String newQuote = quote.replace(found, "");
            System.out.println(newQuote);
        } else {
            System.out.println("Your term was not found.");
        }
        input.close();


    }
}
