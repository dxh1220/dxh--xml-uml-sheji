package 设计模式.装饰者模式;

public class Decorator extends Drink {
    private  Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice自己的价格
        return super.getPrice() + obj.cost();
    }

    public String getDes() {
        //obj.getDes()输出被装饰者的信息
        return super.des+" "+super.getPrice()+"&&"+obj.getDes();
    }
}
