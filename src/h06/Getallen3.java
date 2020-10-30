package h06;

import java.awt.*;
import java.applet.*;


public class Getallen3 extends Applet {
    int a,b,c;


    public void init() {
        a =  2147483647;
        b =  214748364;
        c = a+b;
    }

    public void paint(Graphics g) {
        g.drawString("Schrijf een applet waarin je twee ints met positieve waarden bij elkaar optelt en er een negatieve int uit komt.", 20, 20);
        g.drawString(a+" + "+b+" = "+c, 20, 40);
    }
}