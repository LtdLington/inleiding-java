package h06;

import java.awt.*;
import java.applet.*;


public class Praktijk6 extends Applet {
    double a,b,c,d,e,f,uitkomst;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = (a+b+c) /3;
        e = d *10;
        f = (int) e;
        uitkomst = f /10;




    }

    public void paint(Graphics g) {
        g.drawString("Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.\n" +"Schrijf een applet in Java, waarin van de bovenstaande cijfers het gemiddelde wordt uitgerekend en dat gemiddelde met één decimaal op het scherm wordt getoond. Op het scherm komt te staan: Het gemiddelde is: 6.3",20,20);
        g.drawString("Gemiddelde is"+uitkomst,20,40);
    }
}