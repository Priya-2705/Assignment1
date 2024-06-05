package com.humber.java.assignment1;

import java.util.Scanner;

public class TestTriangle{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side1 of triangle: ");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter side2 of triangle: ");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter side3 of triangle: ");
		double side3 = sc.nextDouble();
		
		System.out.println("Enter the color of the triangle: ");
		String color = sc.next();
		
		System.out.println("Is the triangle filled? True/False");
		boolean isFilled = sc.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		
		System.out.println(color + " triangle is created");
		System.out.println("Specifications of the triangle are as follows: ");
		System.out.println("Area of the Triangle: " + triangle.getArea());
		System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
		System.out.println("Color of the Triangle: " + triangle.getColor());
		System.out.println("Is the triangle filled? " + triangle.isFilled());
		
		sc.close();
	}
}