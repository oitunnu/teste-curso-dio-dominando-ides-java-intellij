package com.dio.intro;
//exercicio de sobrecarga
public class QuadArea {
    public static void area(double side) {
        System.out.println("Area of a square:" + side*side);
    }

    public static void area(double width, double height) {
        System.out.println("Area of a rectangle:" + width*height);
    }

    public static void area(double smallBase, double bigBase, double height) {
        System.out.println("Area of a trapezoid:" + ((smallBase + bigBase)*height)/2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Area of a rhombus:" + (diagonal1 * diagonal2)/2);
    }
}
