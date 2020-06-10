package 设计模式.桥接模式;

public class UpRigetPhone extends Phone {

    public UpRigetPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立样式手机");
    }
    public void close(){
        super.close();
        System.out.println("直立样式手机");
    }
    public void call(){
        super.call();
        System.out.println("直立样式手机");
    }
}
