package basics;

/*
    Write a java program that read a number of the month And then print the name of it
 */

import java.util.Objects;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type Number Of The Month: ");
        int monthNumber = input.hasNextInt() ? input.nextInt() : 0;
        String month = getMonth(monthNumber);

        if (!Objects.equals(month, "Invalid Input")){ // null safe comparison
            System.out.println("The Month Is: " + month);
        }else {
            System.out.println("Invalid Input");
        }
    }

    private static String getMonth(int numOfMonth) {
        return switch (numOfMonth) { // used enhanced 'switch' syntax
            case 1  -> "January";
            case 2  -> "February";
            case 3  -> "March";
            case 4  -> "April";
            case 5  -> "May";
            case 6  -> "June";
            case 7  -> "July";
            case 8  -> "August";
            case 9  -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input";
        };
    }

}
