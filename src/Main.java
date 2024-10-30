public class Main {
    public static void main(String[] args) {

        Transport[] transports = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        ServiceStation station = new ServiceStation();

        station.check(transports[0]);
        System.out.println();
        station.check(transports[1]);
        System.out.println();
        station.check(transports[2]);
        System.out.println();
        station.check(transports[3]);
        System.out.println();
        station.check(transports[4]);
        System.out.println();
        station.check(transports[5]);

    }
}
