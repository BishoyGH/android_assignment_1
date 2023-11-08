package loops;
/*
    6- program to display the following sequence of numbers: 7 14 21 28 35 42 49 56
    63 70 77 84 91 98
 */
public class Q6 {
    public static void main(String[] args) {
        for (int i = 7; i <= 98; i+=7)
            System.out.print(i + " ");
    }
}
