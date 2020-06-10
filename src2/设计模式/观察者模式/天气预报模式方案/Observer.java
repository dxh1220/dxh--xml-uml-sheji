package 设计模式.观察者模式.天气预报模式方案;

public interface Observer {
    public void update(float temperature,float pressure,float humidity);
}
