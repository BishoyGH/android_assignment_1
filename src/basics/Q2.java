package basics;

/*
    Write a java program that read a number of the month and print the month is in Summer, spring,
    winter or autumn.
 */

import java.util.Objects;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type Number Of The Month: ");
        int monthNumber = input.hasNextInt() ? input.nextInt() : 0;
        String season = getSeason(monthNumber);

        if (!Objects.equals(season, "Invalid Input")){ // null safe comparison
            System.out.println("The Season Is: " + season);
        }else {
            System.out.println("Invalid Input");
        }
    }

    private static String getSeason(int numOfMonth){
        return switch (numOfMonth) { // used enhanced 'switch' syntax
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid Input";
        };
    }
}
