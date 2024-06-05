package com.humber.java.assignment1;

public class TriangleWithException extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    public TriangleWithException() {
        super();
    }

    public TriangleWithException(double side1, double side2, double side3) throws TriangleException {
        super();
        
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
        	throw new TriangleException("Any side should not be 0 or less than zero");
        }
        else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
        	throw new TriangleException("The sum of any two sides must be greater than the other side.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }


    public double getSide2() {
        return side2;
    }


    public double getSide3() {
        return side3;
    }


    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
