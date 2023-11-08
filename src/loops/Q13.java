package loops;
/*
    *13-Write a program that displays all the numbers from 100 to
    200, ten per line, that are divisible by 5 or 6, but not both.
    Numbers are separated by exactly one space
 */
public class Q13 {
    public static void main(String[] args) {
        int numsPerRow = 0;
        for (int i = 100; i <= 200; i++){
            if(numsPerRow == 10) {
                System.out.print("\n");
                numsPerRow = 0;
            }
            if(i % 5 == 0) {
               if(i % 6 != 0) {
                   System.out.print(i + " ");
                   numsPerRow++;
               }
           }
           if(i % 6 == 0) {
                if(i % 5 != 0) {
                    System.out.print(i + " ");
                    numsPerRow++;
                }
           }
        }
    }
}
