public class ServiceStation {

    public void check(Transport transports) {
        System.out.println("Обслуживаем " + transports.getModelName());
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            transports.updateTyre();
        }
        if (transports instanceof Car) {
            transports.checkEngine();
        }
        if (transports instanceof Truck) {
            transports.checkEngine();
            transports.checkTrailer();
        }

    }

}
