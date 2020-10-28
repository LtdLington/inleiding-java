package h04;

import java.awt.*;
import java.applet.*;

public class PaintingsBeta extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(10,15,125,15);
        g.drawString("Lijn",10,30);
        g.drawRect(10, 50, 115, 50);
        g.drawString("Rechthoek",10,115);
        g.drawString("Lege rechthoek,gevuld ovaal",150,115);
        g.drawRoundRect(10,130,115,50,10,10);
        g.drawString("Afgeronde rechthoek",10,195);
        g.drawString("Gevuld ovaal",150,195);
        g.drawOval(350, 50, 100, 50);
        g.drawString("Taartpunt met ovaal",355,115);
        g.drawOval(355, 125, 75, 75);
        g.drawString("cirkel",370,225);
        g.setColor(Color.magenta);
        g.drawRect(150, 50, 115, 50);
        g.fillOval(150, 125, 115, 50);
        g.fillOval(150, 50, 115, 50);
        g.fillArc(350, 50, 100, 50, 0, 45);
    }
}
