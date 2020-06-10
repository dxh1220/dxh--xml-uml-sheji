package 设计模式.工厂模式.简单工厂模式.order;

//相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

        //使用静态工厂模式
        new OrderPizza2();
    }

}
