package loops;
/*
    1- A program to print numbers divisible by 5, for the integers from 1 to 99.
 */
public class Q1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++){
            if(i % 5 == 0) System.out.print(i + " ");
        }
    }
}
