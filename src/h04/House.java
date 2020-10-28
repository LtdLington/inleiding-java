package h04;

import java.awt.*;
import java.applet.*;

public class House extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.orange);
        g.drawRect(200, 200, 250, 150);
        g.setColor(Color.red);
        g.drawLine(200,200,325,30);
        g.drawLine(325,30,450,200);
        g.setColor(Color.black);
        g.fillRect(220, 310, 30, 40);
        g.setColor(Color.cyan);
        g.fillRect(220, 230, 150, 20);
        g.fillRect(325, 310, 100, 20);
        g.fillOval(310, 80, 30, 30);
        g.setColor(Color.orange);
        g.drawString("Oranje is body huis!!", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Rood is dak huis!!", 50, 80 );
        g.setColor(Color.black);
        g.drawString("Zwart is deur!!", 50, 100 );
        g.setColor(Color.cyan);
        g.drawString("Blauw zijn ramen!!", 500, 120 );



    }
}
