package 七大原则.依赖倒转原则.improve;
//实现依赖倒转原则
//方式:
//1.通过接口传递实现依赖
//2.通过构造方法依赖传递
//3.通过setter方法依赖传递
public class DependecyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
//定义接口
interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello world!";
    }
}
//增加微信
class WeiXin implements IReceiver{
    public String getInfo(){
        return "你好，再见";
    }
}

class Person {
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}