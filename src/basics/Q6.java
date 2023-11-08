package basics;

import java.util.Scanner;

/*
    Write a program which calculates marks on basis of given grades in java using switch statement

    if Grade A then marks >=80

    if Grade B then marks >=60 and less than 80
    if Grade C then marks >=40 and less than 60

    if Grade F then marks <=40
    if any other grade is passed then print invalid grade
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade from (A, B, C or F) : ");

        try {
            char grade = input.nextLine().toLowerCase().charAt(0);
            System.out.println(getMarks(grade));
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }

    private static String getMarks(char grade){
        return switch (grade){
            case 'a' -> "Marks >=80";
            case 'b' -> "Marks >=60 and less than 80";
            case 'c' -> "Marks >=40 and less than 60";
            case 'f' -> "Marks <=40";
            default  -> "Invalid Grade";
        };
    }
}
