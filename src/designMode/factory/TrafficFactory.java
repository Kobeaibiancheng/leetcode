package designMode.factory;

public class TrafficFactory {

    public TrafficTools getTraffic(String trafficType){
        if (trafficType == null){
            return null;
        } else if (trafficType.equalsIgnoreCase("bus")) {
            return new Bus();
        }else if (trafficType.equalsIgnoreCase("airplane")){
            return new Airplane();
        }else if (trafficType.equalsIgnoreCase("car")){
            return new Car();
        }
        return null;
    }
}
