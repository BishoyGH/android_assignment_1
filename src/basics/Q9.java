package basics;

import java.util.Scanner;

/*
    3-minandmax
    How Can Find The Minimum/maximum of three numbers using conditional operator. for example
    3
    1
    5
    Max=5
    Min=1
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("First Number: ");
            int num1 = input.nextInt();
            System.out.print("Second Number: ");
            int num2 = input.nextInt();
            System.out.print("Third Number: ");
            int num3 = input.nextInt();

            int min = num1;
            int max = num1;

            if(num2 < num1 && num2 < num3) min = num2;
            if(num3 < num1 && num3 < num2) min = num3;

            if(num2 > num1 && num2 > num3) max = num2;
            if(num3 > num1 && num3 > num2) max = num3;

            System.out.println("Min=" + min + "\nMax=" + max);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
