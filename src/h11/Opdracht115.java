package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht115 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 20;
        int x = 20;

        for(teller = 0; teller < 6; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x,y, 20,20);
        }
    }
}