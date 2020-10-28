package h04;

import java.awt.*;
import java.applet.*;

public class Trafficlight extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Stoplicht",200,15);
        g.fillRect(150,25,150,325);
        g.setColor(Color.red);
        g.fillOval(190, 50, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(190, 150, 75, 75);
        g.setColor(Color.green);
        g.fillOval(190, 250, 75, 75);
    }
}
