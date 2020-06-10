package 设计模式.单例.枚举;

import java.util.EnumMap;

public class test {
    public static void main(String[] args) {
        System.out.println("枚举");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance2.hashCode()"+instance2.hashCode());
        instance.isOK();
    }
}

//推荐使用
//避免多线程的问题，防止反序列化重新创建新的对象
enum Singleton {
    INSTANCE;
    public void isOK(){
        System.out.println("OK");
    }
}