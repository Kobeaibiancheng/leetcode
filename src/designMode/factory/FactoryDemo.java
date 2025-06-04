package designMode.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        TrafficFactory trafficFactory = new TrafficFactory();
        TrafficTools bus = trafficFactory.getTraffic("bus");
        TrafficTools airplane = trafficFactory.getTraffic("airplane");
        TrafficTools car = trafficFactory.getTraffic("car");

        bus.running();
        car.running();
        airplane.running();
    }
}
