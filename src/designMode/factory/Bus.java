package designMode.factory;

public class Bus implements TrafficTools {
    @Override
    public void running() {
        System.out.println("Bus:这里是乘坐公交车！");
    }
}
