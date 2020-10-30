package h06;

import java.awt.*;
import java.applet.*;


public class Getallen1 extends Applet {
    double a, b, uitkomst;
    int c, d;


    public void init() {
       a = 113;
       b = 4;
       c = 113;
       d = 4;
       uitkomst = a / b;

    }

    public void paint(Graphics g) {
        g.drawString("Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur, dag en jaar gaan en de uitkomst van de berekening in het venster van de applet toont.", 20, 20);
        g.drawString(c+" gedeeld door "+d, 20, 40);
        g.drawString("Ali krijgt: " + uitkomst, 20, 60);
        g.drawString("Jan krijgt: " + uitkomst, 20, 80);
        g.drawString("Jaenette krijgt: " + uitkomst, 20, 100);
        g.drawString("Ik krijg: " + uitkomst, 20, 120);
    }
}