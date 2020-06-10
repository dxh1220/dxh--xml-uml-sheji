package 七大原则.里氏替换原则.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 =" + a.func1(11,3));
        System.out.println("1-8 =" + a.func1(1,8));
        System.out.println("--------------------");
        B b = new B();
        System.out.println("11+3 =" + b.func1(11,3));
        System.out.println("1+8 =" + b.func1(1,8));
        System.out.println("1+8+9 =" + b.func2(1,8));
        System.out.println("--------------------");
        //使用组合依然可以使用到A类中方法
        System.out.println("11-3 =" + b.func3(11,3));
    }
}

//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写到Base类
}

//A类继承了Base
class A extends Base{
    public int func1(int num1,int num2){
        return  num1 - num2;
    }
}

//B类继承了Base
//增加了新的功能
class B extends Base {
    private A a = new A();
    public int func1(int num1,int num2){
        return  num1 + num2;
    }
    public int func2(int num1,int num2){
        return  func1(num1, num2) + 9;
    }
    public int func3(int num1,int num2) {
         return this.a.func1(num1, num2);
    }
}