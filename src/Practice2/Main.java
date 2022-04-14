package Practice2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("Distance: " + DISTANCE +" KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
