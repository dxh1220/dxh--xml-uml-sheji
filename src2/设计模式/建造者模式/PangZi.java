package jianzaozhe;

import java.awt.*;

public class PangZi extends PersonBuilder{

    public PangZi(Graphics g) {
        super(g);
    }
    public void buildArmLeft()
    {
        g.drawLine(180, 240, 120, 390);// 左手
    }

    public void buildArmRight()
    {
        g.drawLine(390, 360, 280, 240);// 右手
    }

    public void buildBody()
    {
        g.fillRect(180, 240, 100, 150);// 身体
    }

    public void buildHead()
    {
        g.fillOval(180, 150, 90, 90);// 头
    }

    public void buildLegLeft()
    {
        g.drawLine(220, 390, 135, 540);// 左腿
    }

    public void buildLegRight()
    {
        g.drawLine(250, 390, 275, 540);// 右腿
    }
}
