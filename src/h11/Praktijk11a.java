package h11;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk11a  extends Applet {
    TextField tekstvak;
    Button ok;
    int getal;

    public void init() {
        tekstvak = new TextField("");
        add(tekstvak);
        ok = new Button("ok");
        ok.addActionListener(new KnopListener());
        add(ok);
    }

    public void paint(Graphics g) {
        int teller;
        int hoogte = 5;
        for(teller = 1; teller < 11; teller++) {
            g.drawString(" "+teller+" x "+getal+" = "+(teller * getal), 50, hoogte + teller * 25);
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            repaint();
        }
    }
}
