//TAKE A INPUT FROM USER OF MARKS OF 5 SUBJECTS AND PRINT PERCENTAGE
package com.company;
import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Java");
        float a = sc.nextFloat();
        System.out.println("Enter Marks of Python");
        float b = sc.nextFloat();
        System.out.println("Enter Marks of C");
        float c = sc.nextFloat();
        System.out.println("Enter Marks of C++");
        float d = sc.nextFloat();
        System.out.println("Enter Marks of Kotlin");
        float e = sc.nextFloat();
        float total = a+b+c+d+e;
        float per =(total/5);
        System.out.println("Your total marks are:"+total);
        System.out.println("Your percentage is:"+per);

    }
}
