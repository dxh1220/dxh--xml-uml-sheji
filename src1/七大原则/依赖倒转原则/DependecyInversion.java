package 七大原则.依赖倒转原则;
//未实现依赖倒转原则
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello world!";
    }
}

//完成Person接受消息的功能
//方式一分析
//1.简单，比较容易想到
//2.如果我们获取的对象说是微信，短信等则新增类，同时Person也需要增加相应的接收方法
//3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceriver发生依赖
//因为Email，WeiXin等输入接受的范围，他们各自实现IReceiver接口就ok，这样我们就符合依赖倒转原则

class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}