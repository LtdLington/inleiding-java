package h06;

import java.awt.*;
import java.applet.*;


public class Getallen2 extends Applet {
  int  minuut, uur, dag,jaar;

    public void init() {
      minuut = 60;
      uur = minuut * minuut;
      dag = uur * 24;
      jaar = dag * 356;

    }

    public void paint(Graphics g) {
        g.drawString("Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur, dag en jaar gaan en de uitkomst van de berekening in het venster van de applet toont.", 20, 20);
        g.drawString("Seconden in een uur, dag en jaar!!", 20, 50);
        g.drawString("Seconden in een uur:"+uur,20, 60);
        g.drawString("Seconden in een dag:"+dag,20, 80);
        g.drawString("Seconden in een jaar:"+jaar,20, 100);
    }
}