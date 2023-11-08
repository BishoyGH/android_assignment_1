package basics;

import java.util.Scanner;

/*
    1. Write a Java program to get a number from the user and print whether it is positive or negative.
    Input number: 35
    Expected Output :
    Number is positive
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Number: ");

        try{
            int num = input.nextInt();

            if(num > 0) {
                System.out.println("Number is Positive");
            } else if (num < 0) {
                System.out.println("Number is Negative");
            } else {
                System.out.println("Number is Zero");
            }

        }catch (Exception e){
            System.out.println("Invalid Input");
        }

    }
}
