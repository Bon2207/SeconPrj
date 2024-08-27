/*
 *@ (#) Rectangle.java      1.0       25/08/2024
 *
 *Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.dhkhmt18a;

/**
 * The Rectangle class represents a rectangle with a length and width.
 * It provides methods to calculate the area and perimeter of the rectangle.
 *
 * @description Provides methods to calculate the area and perimeter of a rectangle.
 * @author Bui Nguyen Mai Bon
 * @date 25/08/2024
 * @version 1.0
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructs a Rectangle object with a specified length and width.
     *
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @throws IllegalArgumentException If the length or width is not greater than 0
     */
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Updates the length of the rectangle.
     *
     * @param newVal The new length
     * @throws IllegalArgumentException If the new length is not greater than 0
     */
    public void setLength(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = newVal;
    }

    /**
     * Updates the width of the rectangle.
     *
     * @param newVal The new width
     * @throws IllegalArgumentException If the new width is not greater than 0
     */
    public void setWidth(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = newVal;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Main method to test the Rectangle class.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Display the area and perimeter
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Update the length and width
        rect.setLength(6.0);
        rect.setWidth(4.0);

        // Display the updated area and perimeter
        System.out.println("Updated Area: " + rect.getArea());
        System.out.println("Updated Perimeter: " + rect.getPerimeter());
    }
}