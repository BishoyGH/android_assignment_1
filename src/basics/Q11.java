package basics;

import java.util.Scanner;

/*
    3.write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.
    Example:
    Input:
    21 , -4 , 14 , -3
    Output:
    Sum of positive integers7
    Sumif Negative Integers-7
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("1st Number: ");
            int num1 = input.nextInt();
            System.out.print("2nd Number: ");
            int num2 = input.nextInt();
            System.out.print("3rd Number: ");
            int num3 = input.nextInt();
            System.out.print("4th Number: ");
            int num4 = input.nextInt();
            System.out.print("5th Number: ");
            int num5 = input.nextInt();
            System.out.print("6th Number: ");
            int num6 = input.nextInt();

            int sumOfPositive = 0;
            int sumOfNegative = 0;

            if(num1 > 0) sumOfPositive += num1; else sumOfNegative += num1;
            if(num2 > 0) sumOfPositive += num2; else sumOfNegative += num2;
            if(num3 > 0) sumOfPositive += num3; else sumOfNegative += num3;
            if(num4 > 0) sumOfPositive += num4; else sumOfNegative += num4;
            if(num5 > 0) sumOfPositive += num5; else sumOfNegative += num5;
            if(num6 > 0) sumOfPositive += num6; else sumOfNegative += num6;

            System.out.println("Sum Of Positive Integers = " + sumOfPositive);
            System.out.println("Sum Of Negative Integers = " + sumOfNegative);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }

    }
}
