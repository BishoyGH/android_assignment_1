package basics;

import java.util.Scanner;

/*
    2-SortingThreeFloatingNumbers
    Write a program that reads in three Floating-point numbers and sort them. For Example
    2.5
    9
    4
    Use only conditional statement
    Output
    2.5

    4
    9
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("First Number: ");
            double num1 = input.nextDouble();
            System.out.print("Second Number: ");
            double num2 = input.nextDouble();
            System.out.print("Third Number: ");
            double num3 = input.nextDouble();

            if(num1 < num2 && num1 < num3){
                // Smallest Num1
                System.out.println(num1);
                if(num2 < num3){
                    System.out.println(num2 + "\n" + num3);
                }else {
                    System.out.println(num3 + "\n" + num2);
                }

            } else if (num2 < num1 && num2 < num3) {
                // Smallest Num2
                System.out.println(num2);
                if(num1 < num3){
                    System.out.println(num1 + "\n" + num3);
                }else {
                    System.out.println(num3 + "\n" + num1);
                }

            } else {
                // Smallest Num3
                System.out.println(num3);
                if(num1 < num2){
                    System.out.println(num1 + "\n" + num2);
                }else {
                    System.out.println(num2 + "\n" + num1);
                }
            }
        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }

    }
}
