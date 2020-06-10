package jianzaozhe;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class khd {
    public static class Main extends Frame
    {
        public void paint(Graphics g)
        {
            Color c = g.getColor();
            g.setColor(Color.BLACK);
            ShouZi shouZi = new ShouZi(g);
            PersonDirector pdThin = new PersonDirector(shouZi);
            pdThin.createPerson();
            g.setColor(c);
            PangZi pangZi = new PangZi(g);
            PersonDirector Pdpz = new PersonDirector(pangZi);
            Pdpz.createPerson();
            g.setColor(c);
        }

        public void lauchFrame()
        {
            this.setLocation(400, 300);
            this.setSize(800, 600);

            this.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });

            this.setBackground(Color.WHITE);
            setVisible(true);
        }
        public void lauchFrameB()
        {
            this.setLocation(800, 300);
            this.setSize(1000, 600);

            this.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });

            this.setBackground(Color.WHITE);
            setVisible(true);
        }

        public static void main(String[] args)
        {
            Main drawPerson = new Main();
            drawPerson.lauchFrame();
            drawPerson.lauchFrameB();

        }
    }
}
