package basics;

import java.util.Scanner;

/*
    Take three numbers from the user and print the greatest number.
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87 , Expected Output : The greatest: 87
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("1st Number: ");
            int num1 = input.nextInt();
            System.out.print("2nd Number: ");
            int num2 = input.nextInt();
            System.out.print("3rd Number: ");
            int num3 = input.nextInt();

            int max = num1;

            if(num2 > num1 && num2 > num3) max = num2;
            if(num3 > num1 && num3 > num2) max = num3;

            System.out.println("The greatest: " + max);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
