package 设计模式.观察者模式.天气预报模式方案;

//接口，需要让WeatherData来实现
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
