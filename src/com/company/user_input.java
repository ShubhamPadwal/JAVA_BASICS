package com.company;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
        //int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
        //int b = sc.nextInt();
//        float b = sc.nextFloat();
        //int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);
        System.out.println("Enter string");
//3        String str = sc.next();  //This does not print spaces
        String str = sc.nextLine(); //This prints spaces also
        System.out.println(str);
    }
}
