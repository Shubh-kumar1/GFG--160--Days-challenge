// User function Template for Java

import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                // Area of circle: π * r^2
                if (arr.size() == 1) {
                    double r = arr.get(0);
                    return Math.PI * r * r;
                } else {
                    throw new IllegalArgumentException("Circle requires 1 value: radius");
                }

            case 2:
                // Area of rectangle: l * b
                if (arr.size() == 2) {
                    double l = arr.get(0);
                    double b = arr.get(1);
                    return l * b;
                } else {
                    throw new IllegalArgumentException("Rectangle requires 2 values: length and breadth");
                }

            default:
                throw new IllegalArgumentException("Invalid choice. Use 1 for circle or 2 for rectangle.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Circle Area: " + switchCase(1, List.of(5.0)));       // 78.5398...
        System.out.println("Rectangle Area: " + switchCase(2, List.of(4.0, 6.0))); // 24.0
    }
}