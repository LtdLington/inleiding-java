package h04;

import java.awt.*;
import java.applet.*;

public class Dice extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(250, 25, 250, 225, 10, 10);
        g.fillOval(270, 40, 75, 75);
        g.fillOval(400, 40, 75, 75);
        g.fillOval(270, 150, 75, 75);
        g.fillOval(400, 150, 75, 75);
        g.drawString("Zijde 4 van een dobbelsteen",250,15);
    }
}
