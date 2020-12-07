package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht123 extends Applet {
    TextField tekstvakken[];
    int nummers[];
    Button knop;
    int y;

    public void init() {
        tekstvakken = new TextField[5];
        nummers = new int[5];
        for (int i = 0; i < 5; i++) {
            tekstvakken[i] = new TextField("", 1);
            add(tekstvakken[i]);
        }
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g)  {
        y = 60;
        for (int i = 0; i < 5; i++) {
            g.drawString("" + nummers[i], 50, y);
            y += 15;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            for (int i = 0; i < 5; i++) {
                String s = tekstvakken[i].getText();
                nummers[i] = Integer.parseInt(s);
                tekstvakken[i].setText("");
            }
            Arrays.sort(nummers);
            repaint();
        }
    }
}