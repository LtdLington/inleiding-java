package h04;

import java.awt.*;
import java.applet.*;

public class Flag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("De nederlandse vlag!!", 50, 60 );
        g.setColor(Color.red);
        g.fillRect(250, 20, 200, 50);
        g.setColor(Color.black);
        g.drawRect(250, 20, 200, 150);
        g.setColor(Color.cyan);
        g.fillRect(250, 120, 200, 50);
        g.setColor(Color.orange);
        g.fillRect(225, 20, 25, 400);
    }
}
