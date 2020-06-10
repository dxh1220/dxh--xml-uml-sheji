package 设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //三个参数：
        //1.ClassLoader loader:指定当前目标对象使用的类加载器，获取加载器的方法固定
        //2.Class<?>[] interfaces:目标对象实现的接口类型，使用泛型方法确认类型
        //3.InvocationHandler h:事情处理，执行目标对象方法时，会触发事件处理器的方法，会把当前执行的对象方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return returnVal;
                    }
                });
    }
}
