package 设计模式.装饰者模式;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f); //当前调味品的价格
    }
}
