package constant;

public class Math {

    private static final double PI = 3.14;
    private static final double GRAVITY_ACCELERATION = 9.8;

    public static double circleArea(double radius) {
        // PI = 3.14
        double area = PI * radius * radius;
        return area;
    }
}
