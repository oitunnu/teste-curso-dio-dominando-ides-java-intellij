package com.dio.intro;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        // creating a scan to get input from user
        Scanner scan = new Scanner(System.in);

        float a, b;

        // getting user's input
        System.out.println("Write the first number: ");
        a = scan.nextFloat();
        System.out.println("Write the second number: ");
        b = scan.nextInt();

        // storing the value before displaying the result; recommended
        float add = add(a, b);
        System.out.println("The sum is: " + add);

        float subtract = subtract(a, b);
        System.out.println("The difference is " + subtract);

        // displaying result without storing the value first
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));

    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
            return a * b;
    }

    public static float divide(float a, float b) {
            return a / b;
    }


}
