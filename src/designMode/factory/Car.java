package designMode.factory;

public class Car implements TrafficTools {
    @Override
    public void running() {
        System.out.println("Car:这里是乘坐小汽车！");
    }
}
