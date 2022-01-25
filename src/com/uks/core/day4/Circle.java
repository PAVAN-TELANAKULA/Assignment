package com.uks.core.day4;
public class Circle
{
    double PI = 3.14;
    public void areaOfCircle(long radius)
    {
        double A=PI*radius*radius;
        System.out.println("Area of circle with long = "+A);

    }
    public void areaOfCircle(double radius)
    {
        double B=PI*radius*radius;
        System.out.println("Area of circle with double = "+B);

    }
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        circle.areaOfCircle(3);
        circle.areaOfCircle(5.6);
    }
}
