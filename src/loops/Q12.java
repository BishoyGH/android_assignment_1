package loops;

import java.util.Scanner;

/*
    12- Given a number, print how many times can we divide it by 2?
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Type Number: ");
            int num = input.nextInt();

            int times = 0;

            while (num != 0){
                num /= 2;
                if(num == 0) break;
                times++;
            }

            System.out.println("This Number Can be Divided By 2: " + times + " Times.");

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
