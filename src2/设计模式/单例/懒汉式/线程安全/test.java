package 设计模式.单例.懒汉式.线程安全;

public class test {
    public static void main(String[] args) {
        System.out.println("懒汉式：线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance2.hashCode()"+instance2.hashCode());
    }
}

//懒汉式（线程安全）
//优点：解决了线程安全问题
//缺点：效率太低了
//结论：实际开发不能用
class Singleton {
    private static Singleton instance;
    private Singleton(){}
    //提供一个公有的静态方法，加入同步处理的代码，解决线程问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}