package com.humber.java.assignment1;

public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}