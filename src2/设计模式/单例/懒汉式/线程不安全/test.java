package 设计模式.单例.懒汉式.线程不安全;

public class test {
    public static void main(String[] args) {
        System.out.println("懒汉式：线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance2.hashCode()"+instance2.hashCode());
    }
}

//懒汉式（线程不安全）
//优点：用到才去创建，不浪费空间
//缺点：只能在单线程中使用
//结论：实际开发不能用
class Singleton {
    private static Singleton instance;
    private Singleton(){}
    //提供一个公有的静态方法，当使用到该方法时，才创建instance，即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}