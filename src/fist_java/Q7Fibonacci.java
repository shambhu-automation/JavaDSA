package fist_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7Fibonacci {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            System.out.print("Eneter a number:");
            int n = sc.nextInt();
            printFibonacci(n);

        }catch (InputMismatchException e){
            System.out.println("Enter a valid number.");
        }

    }

    private static void printFibonacci(int n) {
        if (n<0) {
            System.out.println("Non zero element");
            return;
        }
        long num1=0;
        long num2=1;

        System.out.print("Fibonacci series till " + n + ": " + num1);

        // Handle case where n is 0 or series needs to continue
        if (n >= 1) {
            System.out.print(", " + num2);

            while (true) {
                long nextTerm = num1 + num2;
                if (nextTerm > n) break;

                System.out.print(", " + nextTerm);
                num1 = num2;
                num2 = nextTerm;
            }
        }
        System.out.println(); // New line for clean output

    }
}
