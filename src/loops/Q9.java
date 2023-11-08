package loops;

import java.util.Scanner;

/*
    9- Write a java program that read positive numbers from user Until read a negative
    number ... then calculate and print The average of these numbers.
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int sum = 0;
            int steps = 0;

            while (true){
                System.out.print("Type Number: ");
                int num = input.nextInt();
                if(num < 0) break;
                steps++;
                sum += num;
            }

            double avg = (double) sum / steps;

            System.out.println("Average = " + avg);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
