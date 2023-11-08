package basics;

/*
    The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels and rest of the
    alphabets are known as consonants. Here we will write a java program that checks whether the
    input character is vowel or Consonant.
 */

import java.util.Objects;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Character that you want to check: ");

        char theChar;

        try{
            theChar = input.nextLine().toLowerCase().charAt(0);
        }catch (Exception e){ // example exception: pressing enter without typing anything
            theChar = ' ';
        }

        String result = vowelOrConsonant(theChar);

        if(!Objects.equals(result, "Invalid Input")){
            System.out.println("The Char Is: " + result);
        }else {
            System.out.println("Invalid Input");
        }
    }

    private static String vowelOrConsonant(char theChar){
        return switch (theChar){
            case 'a', 'e', 'i', 'o', 'u' -> "Vowel";
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> "Consonant";
            default -> "Invalid Input"; // could be non-alphabetic char
        };
    }
}
