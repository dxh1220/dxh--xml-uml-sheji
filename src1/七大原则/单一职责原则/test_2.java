package 七大原则.单一职责原则;

public class test_2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}
//方案2的分析
//1.遵守单一职责原则
//2.这样的改动很大，即将类分解，同时修改客户端
//3.改进：直接修改vehicle类，这样改动代码比较少

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行……");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空上运行……");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在海洋上运行……");
    }
}

