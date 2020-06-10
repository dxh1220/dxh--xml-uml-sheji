package 设计模式.桥接模式;

public class Client {
    public static void main(String[] args) {
        //获取折叠式小米手机（样式+品牌）
        FoldedPhone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println();
        FoldedPhone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println();
        UpRigetPhone phone3 = new UpRigetPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println();
        UpRigetPhone phone4 = new UpRigetPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();

    }
}
