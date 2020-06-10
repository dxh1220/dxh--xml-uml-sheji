package waiguan;

public class Facade {
    SubSystemOne	one;
    SubSystemTwo	two;
    SubSystemThree	three;
    SubSystemFour	four;

    public Facade()
    {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA()
    {
        System.out.println("A股、B股涨");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB()
    {
        System.out.println("A股涨、B股跌");
        one.methodOne();
        three.methodThree();
    }
    public void methodC()
    {
        System.out.println("A股跌、B股跌");
        four.methodFour();
        three.methodThree();
    }
    public void methodD()
    {
        System.out.println("A股跌、B股涨");
        three.methodThree();
        two.methodTwo();
    }

}
