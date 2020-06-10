package 设计模式.观察者模式.天气预报模式方案;

public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        Baidu baidu = new Baidu();

        //注册到WeatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);

        System.out.println("通知各个注册的观察者");
        weatherData.setData(10f,100f,28.8f);
    }
}
