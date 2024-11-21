package math;

public class Math {

    private static double piValue = 3.14;

    public static int sum(int numberA,int numberB) {
        return numberA + numberB;
    }

    public static double square(double side) {
        return side * side;
    }

    public static double circleArea(double radius) {
        // PI = 3.14
        double area = piValue * square(radius);
        return area;
    }

    public static double doubleCircleArea(double radius) {
        double area = circleArea(radius);
        return area;
    }

}
