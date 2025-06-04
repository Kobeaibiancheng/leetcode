package designMode.factory;

public class Airplane implements TrafficTools {
    @Override
    public void running() {
        System.out.println("Airplane:这里是乘坐飞机！");
    }
}
