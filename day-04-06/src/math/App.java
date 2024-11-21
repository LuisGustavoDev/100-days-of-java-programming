package math;

public class App {

    private static void showMessage() {
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {

        showMessage();

        System.out.println(Math.square(2));
        System.out.println(Math.circleArea(2));

        Car car1 = new Car("car1", 2023);
        Car car2 = new Car("car2", 1999);

        System.out.println(car1.getName());
        System.out.println(car2.getName());
        System.out.println(car1.purchaseYear);
        System.out.println(car2.purchaseYear);
    }
} 
