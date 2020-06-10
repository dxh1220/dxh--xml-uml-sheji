package 设计模式.模板模式.标准;

public abstract class SoyaMilk {
    //模板方法，make，模板方法可以做成final，不让子类覆盖
    final void make(){
        select();
        add();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：选好新鲜黄豆");
    }

    //添加不同配料，抽象方法，子类具体实现
    abstract void add();

    void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡三小时");
    }

    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
}
