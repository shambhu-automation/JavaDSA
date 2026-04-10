package fist_java;

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        even_or_odd(num);
    }

    private static void even_or_odd(int num) {
        if (num%2==0) System.out.println("Number is even number");
        else System.out.println("Number is odd number");
    }
}
