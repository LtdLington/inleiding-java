package h05;

import java.applet.*;
import java.awt.*;

public class PaintingsAlpha extends Applet {
    Color paars;
    Color zwart;
    int x;
    int y;
    int z;
    String rechthoek;
    String rechthoek2;
    String rechthoek3;
    String ovaal;
    String taartpunt;
    String cirkel;
    String lijn;

    public void init() {
        paars = Color.magenta;
        zwart = Color.black;
        y = 100;
        x = 200;
        z = 75;
        rechthoek = "Rechthoek";
        rechthoek2 = "Afgeronde rechthoek";
        rechthoek3 = "Gevulde rechthoek met ovaal";
        ovaal = "Gevulde ovaal";
        taartpunt = "Taartpunt met ovaal eromheen";
        cirkel = "Cirkel";
        lijn = "Lijn";
    }
    public void paint(Graphics g) {
        g.setColor(paars);
        g.fillOval(300, 50, x,y);
        g.fillOval(300, 170, x,y);
        g.fillRect(300, 50, x,y);
        g.fillArc(550, 50, x,y, 0, 45);
        g.setColor(zwart);
        g.drawOval(300, 50, x,y);
        g.drawLine(10,25,x,25);
        g.drawRect(10, 50, x,y);
        g.drawRoundRect(10,170,x,y,10,10);
        g.drawOval(550, 50, x,y);
        g.drawOval(620, 185, z, z);
        g.drawString(rechthoek,10,165);
        g.drawString(rechthoek2,10,285);
        g.drawString(rechthoek3,300,165);
        g.drawString(ovaal,300,285);
        g.drawString(taartpunt,550,165);
        g.drawString(cirkel,640,275);
        g.drawString(lijn,80,40);
    }
}