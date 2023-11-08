package loops;

import java.util.Scanner;

/*
    4- You take two number from the user , base and power The output: Base ^ power
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Base: ");
            int base = input.nextInt();
            System.out.print("Power: ");
            int power = input.nextInt();

            double result = 1;

            if(power > 0){
                for(int i = 1; i <= power; i++)
                    result *= base;
            }else {
                for(int i = power; i < 0; i++)
                    result *=base;
                result = 1 / result;
            }

            System.out.println("Result = " + result);

        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
}
