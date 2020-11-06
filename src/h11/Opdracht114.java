package h11;
import java.awt.*;
import java.applet.*;


public class Opdracht114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller < 11; teller++) {
            y += 20;
            g.drawString(teller + "x 3 =" + teller * 3, 50, y );
        }
    }
}
