package loops;
/*
    7- Program to display the following sequence of numbers: 1 2 4 8 16 32 64 128 256
    512
 */
public class Q7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 512; i*=2)
            System.out.print(i + " ");
    }
}
