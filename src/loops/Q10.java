package loops;

import java.util.Scanner;

/*
    *10- Write java program to read integer from user then print sum of digit means add
    all the digits of any number for example if user enter 123 .output is 6 because 1 +2
    +3 = 6 an so on
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Type Number: ");
            int num = input.nextInt();

            int sum = 0;

            while (num != 0){
                sum += num % 10;
                num /= 10;
            }

            System.out.println("Output = " + sum);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
