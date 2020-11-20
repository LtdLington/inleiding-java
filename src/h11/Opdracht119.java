package h11;
import java.applet.*;
import java.awt.*;
public class Opdracht119 extends Applet {

    public void init() {
        setSize(1200,950);
    }

    public void paint(Graphics g) {
        int teller;
        int y = 550;
        int x = 600;
        int breedte = 5;
        int hoogte = 5;

        for(teller = 0; teller < 100; teller++) {
            g.drawOval (x - 10 * teller,y - 10 * teller, breedte + teller * 20, hoogte + teller * 20);

        }
    }
}
