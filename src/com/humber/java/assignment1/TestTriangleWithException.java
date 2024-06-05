package com.humber.java.assignment1;

public class TestTriangleWithException {
    public static void main(String[] args) {
    	
        // Test case with valid sides
        System.out.println("Creating a triangle with valid sides: (3, 4, 5)");
        try {
            TriangleWithException validTriangle = new TriangleWithException(3, 4, 5);
            validTriangle.setColor("Blue");
            validTriangle.setFilled(true);

            System.out.println("Triangle is created");
    		System.out.println("Specifications of the triangle are as follows: ");
    		System.out.println("Area of the Triangle: " + validTriangle.getArea());
    		System.out.println("Perimeter of the Triangle: " + validTriangle.getPerimeter());
    		System.out.println("Color of the Triangle: " + validTriangle.getColor());
    		System.out.println("Is the triangle filled? " + validTriangle.isFilled());
        } catch (TriangleException e) {
            System.out.println("Error creating triangle: " + e.getMessage());
        }

        // Test case with invalid sides
        System.out.println("\nCreating a triangle with invalid sides: (1, 2, 3)");
        try {
            TriangleWithException invalidTriangle = new TriangleWithException(1, 2, 3);
            invalidTriangle.setColor("Green");
            invalidTriangle.setFilled(false);

            System.out.println("Triangle is created");
    		System.out.println("Specifications of the triangle are as follows: ");
    		System.out.println("Area of the Triangle: " + invalidTriangle.getArea());
    		System.out.println("Perimeter of the Triangle: " + invalidTriangle.getPerimeter());
    		System.out.println("Color of the Triangle: " + invalidTriangle.getColor());
    		System.out.println("Is the triangle filled? " + invalidTriangle.isFilled());
        } catch (TriangleException e) {
            System.out.println("Error creating triangle: " + e.getMessage());
        }
        
        // Test case with invalid sides 2
        System.out.println("\nCreating another triangle with invalid sides: (1, 0, -3)");
        try {
            TriangleWithException invalidTriangle = new TriangleWithException(1, 0, -3);
            invalidTriangle.setColor("Orange");
            invalidTriangle.setFilled(true);

            System.out.println("Triangle is created");
    		System.out.println("Specifications of the triangle are as follows: ");
    		System.out.println("Area of the Triangle: " + invalidTriangle.getArea());
    		System.out.println("Perimeter of the Triangle: " + invalidTriangle.getPerimeter());
    		System.out.println("Color of the Triangle: " + invalidTriangle.getColor());
    		System.out.println("Is the triangle filled? " + invalidTriangle.isFilled());
        } catch (TriangleException e) {
            System.out.println("Error creating triangle: " + e.getMessage());
        }
    }
}