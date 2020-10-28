package h04;

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("Driehoek, mocht eigenlijk wel iets groter...",75,20);
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 60);
        g.drawLine(150, 120, 100, 60);
    }
}
