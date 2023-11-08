package basics;

import java.util.Scanner;

/*
    1-Watermelon

    Input

    The first(and only)input line contains an integer number—the weight of the watermelon bought by the boys.
    Output
    PrintYES,if the boys can divide the water melon into two parts,each of them weigh ingeven number of kilos;and
    NO in the opposite case.
    Sampletest(s)
    input
    8
    output
    YES
    Note

    For Example,the boys can divide the watermelon into two parts of 2and 6 kilo s respectively (another variant—two
    parts of 4 and 4 kilos).
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input: ");

        try {
            int num = input.nextInt();
            System.out.println("Output:\n" + (isEven(num) ? "YES" : "NO"));
        }catch (Exception e){
            System.out.println("Error: Invalid Input");
        }


    }

    private static boolean isEven(int num){
        return num % 2 == 0;
    }
}
