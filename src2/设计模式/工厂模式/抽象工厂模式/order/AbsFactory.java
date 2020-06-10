package 设计模式.工厂模式.抽象工厂模式.order;

import 设计模式.工厂模式.抽象工厂模式.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
