package fist_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8_Palindrom {
    public static void main(String[] args) {
     try(Scanner sc =new Scanner(System.in)) {
         System.out.print("Enter a string: ");
         String inputString = sc.nextLine();
         isPalindromEnhanced(inputString);
     }catch (InputMismatchException e){
         System.out.println("Enter a valid string");
     }
    }
    private static void isPalindromEnhanced(String input) {
        if (input == null) {
            System.out.println("Invalid input");
            return;
        }

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrom = true;

        while (start < end) {
            char startChar = input.charAt(start);
            char endChar = input.charAt(end);

            // Skip non-alphanumeric characters (spaces, punctuation)
            if (!Character.isLetterOrDigit(startChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                end--;
            } else {
                // Case-insensitive comparison
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    isPalindrom = false;
                    break;
                }
                start++;
                end--;
            }
        }
        System.out.println("Is palindrome: " + isPalindrom);
    }

   /* private static void isPalindrom(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        System.out.println(sb);
        if (inputString.equals(sb.toString())) System.out.println("this is a plaindrom word");
        else System.out.println("this is not a palindrom string");
    }

    private static void isPalindrom2(String input){
        char[] chars = input.toCharArray();
        int start=0;
        int end= chars.length-1;
        boolean ispalindrom=true;
        while(start<end){
            if(chars[start]!=chars[end]){
                ispalindrom=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("is palindrom: "+ispalindrom);

    }*/

}
