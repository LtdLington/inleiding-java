package h04;

import java.awt.*;
import java.applet.*;

public class BargraphBeta extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Staafdiagram",150,15);
        g.drawLine(50,25, 50,280);
        g.drawLine(50,280, 280,280);
        g.drawString("100",20,30);
        g.drawLine(20,30, 280,30);
        g.drawString("80",20,80);
        g.drawLine(20,80, 280,80);
        g.drawString("60",20,130);
        g.drawLine(20,130, 280,130);
        g.drawString("40",20,180);
        g.drawLine(20,180, 280,180);
        g.drawString("20",20,230);
        g.drawLine(20,230, 280,230);
        g.drawString("0",25,280);
        g.setColor(Color.red);
        g.fillRect(300, 25, 50, 25);
        g.fillRect(55,180,50,100);
        g.drawString("Valerie",50,300);
        g.setColor(Color.blue);
        g.fillRect(300, 75, 50, 25);
        g.fillRect(195,80,50,200);
        g.drawString("Hans",200,300);
        g.setColor(Color.green);
        g.fillRect(300, 125, 50, 25);
        g.fillRect(125,30,50,250);
        g.drawString("Jeroen",125,300);
    }
}
