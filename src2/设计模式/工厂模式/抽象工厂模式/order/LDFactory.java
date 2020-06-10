package 设计模式.工厂模式.抽象工厂模式.order;

import 设计模式.工厂模式.抽象工厂模式.pizza.*;

public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
