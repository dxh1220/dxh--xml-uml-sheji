package 设计模式.单例.双重检查;

public class test {
    public static void main(String[] args) {
        System.out.println("双重检查DoubleCheck");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance2.hashCode()"+instance2.hashCode());
    }
}

//双重检查
//实例化一次，进行两次线程判断，保证安全
//推荐使用
class Singleton {
    private static volatile Singleton instance;
    private Singleton(){}
    //提供一个公有的静态方法，加入双重检查代码
    //解决线程安全问题，同时解决加载问题
     public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}