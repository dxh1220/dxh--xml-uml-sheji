package chaoshiquan;

public class khd {
    public static void main(String[] args) {
        Shijuan shijuan;
        System.out.println("学生甲抄的试卷：");
        shijuan=new Xuesheng1();
        shijuan.Shijuan();
        System.out.println("学生乙抄的试卷：");
        shijuan=new Xuesheng2();
        shijuan.Shijuan();
    }
}
