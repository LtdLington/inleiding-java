package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Opdracht123 extends Applet {
   TextField[] tekstvak;
   //Label label;
   Button knop;
   int getal, getal2,getal3,getal4,getal5;

    public void init() {
        tekstvak = new TextField[5];
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        //label = new Label("Typ nummers in de tekstvakken & druk op ok om ze op volgorde te sorteren");
        //add(label);
        add(knop);
        for (int teller = 0; teller < tekstvak.length; teller ++) {
            tekstvak[teller] = new TextField("");
            add(tekstvak[teller]);
        }
        //Arrays.sort(tekstvak);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < tekstvak.length; teller ++) {
            g.drawString("" + tekstvak[teller], 50, 20 * teller + 20);
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak[0].getText();
            getal = Integer.parseInt(s);
            String s1 = tekstvak[1].getText();
            getal2 = Integer.parseInt(s1);
            String s2 = tekstvak[2].getText();
            getal3 = Integer.parseInt(s2);
            String s3 = tekstvak[3].getText();
            getal4 = Integer.parseInt(s3);
            String s4 = tekstvak[4].getText();
            getal5 = Integer.parseInt(s4);
            repaint();
        }
    }
}
