package basics;

/*
    In this Program we are making a simple calculator that performs addition, subtraction, multiplication
    and division based on the user input. The program takes the value of both the numbers (entered by
    user) and then user is asked to enter the operation (+, -, * and /), based on the input program
    performs the selected operation on the entered numbers
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Type The First Number: ");
            double firstNum  = input.nextDouble();

            System.out.println("Type The Second Number: ");
            double secondNum = input.nextDouble();

            System.out.println("Type Operator: ");

            char operator = input.next().charAt(0);

            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + calculate(firstNum, secondNum, operator));

        }catch (Exception e){
            System.out.println(e.getMessage() == null ? "Invalid Input" : e.getMessage());
        }
    }

    private static double calculate(double num1, double num2, char operator){
     return switch (operator){
         case '+' -> num1 + num2;
         case '-' -> num1 - num2;
         case '*' -> num1 * num2;
         case '/' -> num1 / num2;
         default -> throw new IllegalStateException("Unexpected value: " + operator);
     };
    }
}
