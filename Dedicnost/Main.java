package Dedicnost;

public class Main {
    public static void main(String[] args) {
        final Car car = new Car("opol", 150);
        final Truck truck = new Truck("Kia", 150, 100, 20);
        final Boat boat = new Boat("MerglBejgl", 150, 125);

        System.out.println(car.getVykon());
        System.out.println(truck.getLoadMaxWeight());
        System.out.println(boat.getLength());
        car.superCoolSound();



    }
}
