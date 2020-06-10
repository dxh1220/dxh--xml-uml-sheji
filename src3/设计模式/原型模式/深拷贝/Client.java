package 设计模式.原型模式.深拷贝;

public class Client {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Type p = new Type();
        p.name = "赵炀楷";
        p.target = new Target("萌新", "萌新");

        //方式1 完成深拷贝

//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "p.target=" + p.target.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.target=" + p2.target.hashCode());

        //方式2 完成深拷贝
        Type p2 = (Type) p.deepClone();

        System.out.println("p.name=" + p.name + "p.target=" + p.target.hashCode());
        System.out.println("p2.name=" + p.name + "p2.target=" + p2.target.hashCode());

    }
}
