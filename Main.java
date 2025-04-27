public class Main {
    public static void main (String[] args) {
        Car myCar = new Car(120, 45.5, 4);
        myCar.start();
        myCar.displayfuel();
        myCar.honk();

        System.out.println();

        Bicycle myBike = new Bicycle(25, 0.0, true);
        myBike.start();
        myBike.displayfuel();
        myBike.ringBell();
    }
}