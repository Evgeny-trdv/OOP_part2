public class ServiceStation {

    public void check(Transport[] transports) {
        for (int j = 0; j < transports.length; j++) {
            System.out.println("Обслуживаем " + transports[j].getModelName());
            for (int i = 0; i < transports[j].getWheelsCount(); i++) {
                transports[j].updateTyre();
            }
            transports[j].checkEngine();
            transports[j].checkTrailer();
        }
    }

 /*   public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }*/


}
