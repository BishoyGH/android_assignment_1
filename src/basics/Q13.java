package basics;

/*
    Write a Java program to print the area of a circle.

    Test Data:Radius = 7.5

    Expected Output

    Area is = 176.71458676442586
 */

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Radius: ");
            double num1 = input.nextDouble();

            System.out.println("Area Is = " + getCircleArea(num1));

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }

    private static double getCircleArea(double radius){
        return Math.PI * radius * radius;
    }
}
