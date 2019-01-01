package com.thehardnsoft;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        boolean flag = true;
        int number1 = input.nextInt();
        input.nextLine();


        while (flag){
            flag = input.hasNextInt();

            if (flag) {
                System.out.println("Enter any non-numeric character to get the output.");
                System.out.println("Or enter the next number: ");
                int number2 = input.nextInt();
                number1 = findGcd(number1, number2);
            }
        }
        System.out.println(number1);
    }

    public static int findGcd(int a, int b){
        if (a % b ==0){
            return b;
        }
        return findGcd(b, a % b);
    }
}
