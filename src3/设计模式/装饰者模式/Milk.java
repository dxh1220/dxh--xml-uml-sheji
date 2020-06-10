package 设计模式.装饰者模式;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f); //当前调味品的价格
    }
}
