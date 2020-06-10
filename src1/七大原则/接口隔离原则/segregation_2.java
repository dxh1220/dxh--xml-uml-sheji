package 七大原则.接口隔离原则;
//实现接口隔离原则
//接口分开写，需要既实现，不产生额外无用方法
public class segregation_2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

//接口1
interface interface1 {
    void operation1();
}
//接口2
interface interface2 {
    void operation2();
    void operation3();
}
//接口3
interface interface3 {
    void operation4();
    void operation5();
}

class B implements interface1,interface2{
    public void operation1(){ System.out.println("B1"); }
    public void operation2(){ System.out.println("B2"); }
    public void operation3(){ System.out.println("B3"); }
}

class D implements interface1,interface3{
    public void operation1(){
        System.out.println("D1");
    }
    public void operation4(){
        System.out.println("D4");
    }
    public void operation5(){
        System.out.println("D5");
    }
}

class A{//A类通过接口interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(interface1 i) {
        i.operation1();
    }
    public void depend2(interface2 i) {
        i.operation2();
    }
    public void depend3(interface2 i) { i.operation3(); }
}

class C{//C类通过接口interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(interface1 i) {
        i.operation1();
    }
    public void depend4(interface3 i) {
        i.operation4();
    }
    public void depend5(interface3 i) {
        i.operation5();
    }
}
