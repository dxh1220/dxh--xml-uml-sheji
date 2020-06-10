package 设计模式.装饰者模式;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2巧克力+1牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1="+order.cost());
        System.out.println("描述="+order.getDes());

        //2.加入一份牛奶
        order = new Milk(order);
        System.out.println("费用2="+order.cost());
        System.out.println("描述="+order.getDes());

        //3.加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3="+order.cost());
        System.out.println("描述="+order.getDes());

        //4.加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3="+order.cost());
        System.out.println("描述="+order.getDes());

    }
}
