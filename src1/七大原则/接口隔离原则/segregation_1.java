package 七大原则.接口隔离原则;
//未实现接口隔离原则
//只写一个接口，会造成方法重复且无用
public class segregation_1 {
    public static void main(String[] args) {

    }
}
//接口
interface Interface {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class B1 implements Interface{
    public void operation1(){
        System.out.println("B1");
    }
    public void operation2(){
        System.out.println("B2");
    }
    public void operation3(){
        System.out.println("B3");
    }
    public void operation4(){
        System.out.println("B4");
    }
    public void operation5(){
        System.out.println("B5");
    }
}
class D1 implements Interface{
    public void operation1() { System.out.println("D1"); }
    public void operation2() { System.out.println("D2"); }
    public void operation3() { System.out.println("D3"); }
    public void operation4() { System.out.println("D4"); }
    public void operation5() { System.out.println("D5"); }
}
class A1{//A类通过接口interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend2(Interface i) {
        i.operation2();
    }
    public void depend3(Interface i) {
        i.operation3();
    }
}
class C1{//C类通过接口interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend4(Interface i) {
        i.operation4();
    }
    public void depend5(Interface i) {
        i.operation5();
    }
}
