package 设计模式.工厂模式.抽象工厂模式.order;

import 设计模式.工厂模式.抽象工厂模式.pizza.BJCheesePizza;
import 设计模式.工厂模式.抽象工厂模式.pizza.BJPepperPizza;
import 设计模式.工厂模式.抽象工厂模式.pizza.Pizza;

public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
