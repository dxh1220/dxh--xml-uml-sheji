package 设计模式.组合模式;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //创建学校
        University university = new University("清华", "中国顶级大学");
        //创建学院
        College college1 = new College("计算机学院", "计算机学院");
        College college2 = new College("信息工程学院", "信息工程学院");
        //创建各个系
        college1.add(new Department("软件工程","不错"));
        college1.add(new Department("网络工程","不错"));
        college1.add(new Department("计算机科学与技术","老牌专业"));

        college2.add(new Department("通信工程","挺难的"));
        college2.add(new Department("信息工程","很好学"));

        university.add(college1);
        university.add(college2);

        university.print();
    }
}
