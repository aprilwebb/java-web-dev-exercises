package exercises;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven: ");
        int miles = input.nextInt();
        System.out.println("Please enter the amount of gallons consumed: ");
        int gallons = input.nextInt();
        int milesPerGallon = miles / gallons;
        input.close();

        System.out.println("The miles-per-gallon = " + milesPerGallon);
    }
}
