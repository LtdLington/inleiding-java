package h04;

import java.awt.*;
import java.applet.*;

public class Arc extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillArc(20, 20, 100, 50, 90, 50);
        g.setColor(Color.yellow);
        g.fillOval(20, 80, 100, 50);
        g.setColor(Color.black);
        g.drawString("Arc met blauwe achtergrond",20,70);
        g.drawString("Elipse met gele achtergrond",20,150);
    }
}
