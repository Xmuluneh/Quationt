package com.company;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);

    }

    public CircleWithException(double newRadius) {
       setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
            throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive number ");
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        try {
            CircleWithException circleWithException = new CircleWithException(2);
            System.out.println("jone");
            CircleWithException circleWithException1 = new CircleWithException(3);
            System.out.println("kids");
            CircleWithException circleWithException2 = new CircleWithException(-4);
            System.out.println("long");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Algorithms");
        }

        System.out.println("Number of objects created is: "+CircleWithException.getNumberOfObjects());

    }
}
