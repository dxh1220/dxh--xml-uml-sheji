package 七大原则.开闭原则;

//该方式的优缺点：
//（1）优点是好理解，简单易操作
//（2）缺点是违反了设计模式的ocp原则，即对扩展开放（提供方），对修改关闭（使用方）
public class ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    public void drawShape(Shape s){
        if (s.m_type == 1)
            drawRectangle(s);
        else if(s.m_type == 2)
            drawCircle(s);
    }

    private void drawCircle(Shape s) {
        System.out.println("矩形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("圆形");
    }
}
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}