package fist_java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9_ArmstrongNumberBetween2GivenNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first number of range:");
            int num1=sc.nextInt();
            System.out.print("Enter second number of range:");
            int num2=sc.nextInt();
            findAmstrongBetweenNumbers(num1,num2);
        }catch(InputMismatchException e){
            System.out.println("Invalid number, try again");
        }
    }

    private static void findAmstrongBetweenNumbers(int num1, int num2) {
        ArrayList<Integer> amstrungNumbers= new ArrayList<>();
        if(num1>num2){
            System.out.println("Enter a proper range");
            return;
        }
        for (int i = num1; i <= num2; i++) {
            if (isArmstrong(i)) amstrungNumbers.add(i);
        }

        System.out.println("Amstrung Numbers are :"+amstrungNumbers);
    }

/*    private static boolean isAmstrung(int i) {
        int initNum=i;
        int length=String.valueOf(i).length();
        int num=0;
        while(i>0){
            num=num+(int) Math.pow(i%10,length);
            i/=10;
        }
        return initNum==num;
    }*/


    private static boolean isArmstrong(int n) {
        if (n < 0) return false; // Armstrong numbers are usually non-negative
        if (n == 0) return true;

        int originalNum = n;
        // Faster way to find the number of digits
        int digits = (int) Math.log10(n) + 1;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, digits);
            n /= 10;
        }

        return sum == originalNum;
    }
}

