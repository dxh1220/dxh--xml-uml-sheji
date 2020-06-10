package 设计模式.代理模式.动态代理;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    @Override
    public void sayhello() {
        System.out.println("Hello");
    }
}
