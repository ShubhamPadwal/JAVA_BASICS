// WRITE A JAVA CODE TO FIND YOUR NUMBER IS GREATER THAN 100 OR NOT?
package com.company;
import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        int a = 100;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number");
        int b = num.nextInt();
        System.out.println(a<b);

    }
}
