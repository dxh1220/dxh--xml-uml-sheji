package 设计模式.单例.静态内部类;

public class test {
    public static void main(String[] args) {
        System.out.println("静态内部类");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance2.hashCode()"+instance2.hashCode());
    }
}

//静态内部类
//采用类装载机制保证初始化实例时只有一个进程
//需要的时候才会被实例化，才会装载SingletonInstance类，从而完成实例化。
//保证了线程的安全性，延迟加载，效率高
//推荐使用
class Singleton {
    private static volatile Singleton instance;
    private Singleton(){}
//  写一个静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }
    public static synchronized Singleton getInstance(){
        return SingletonInstance.instance;
    }
}