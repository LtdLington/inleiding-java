package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht113 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int n = 10, t1 = 0, t2 = 1;
        int y =0;
        int x =50;

        for (int i = 1; i <= n; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            y += 20;
            g.drawString("" + t1, x, y );
        }
    }
}
