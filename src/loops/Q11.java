package loops;

import java.util.Scanner;

/*
    *11- Write java program to read an integer from user then print how many digit in
    this number
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Type Number: ");
            int num = input.nextInt();

            int digits = 0;

            while (num != 0){
                digits++;
                num /= 10;
            }

            System.out.println("Digits = " + digits);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
