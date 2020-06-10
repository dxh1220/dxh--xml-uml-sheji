package 七大原则.里氏替换原则;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 =" + a.func1(11,3));
        System.out.println("1-8 =" + a.func1(1,8));
        System.out.println("--------------------");
        B b = new B();
        System.out.println("11-3 =" + b.func1(11,3));
        System.out.println("1-8 =" + b.func1(1,8));
        System.out.println("--------------------");

    }
}
//A类
class A{
    public int func1(int num1,int num2){
        return  num1 - num2;
    }
}
//B类继承了A
//增加了新的功能
class B extends A{
    public int func1(int num1,int num2){
        return  num1 + num2;
    }
    public int func2(int num1,int num2){
        return  func1(num1, num2) + 9;
    }
}