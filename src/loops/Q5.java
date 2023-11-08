package loops;

import java.util.Scanner;

/*
    5- You will take number from the user Write a java program to print its factorial.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Num: ");
            int num = input.nextInt();

            if(num > 0){
                int result = 1;

                for (int i = 1; i <= num; i++)
                    result *= i;

                System.out.println("Factorial = " + result);

            }else {
                throw new Exception("Error: Negative Number");
            }

        }catch (Exception e){
            System.out.println(e.getMessage() == null ? "Error: Invalid Input": e.getMessage());
        }
    }
}
