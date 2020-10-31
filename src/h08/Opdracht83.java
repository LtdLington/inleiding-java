package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht83 extends Applet {
    TextField tekstvak;
    Label label;
    double getal,getal2, getal3;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een bedrag");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevoerde bedrag is " + getal, 50, 60 );
        g.drawString("Het BTW bedrag is "+getal2, 50, 80 );
        g.drawString("Totaal bedrag is "+getal3, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal2 = (getal /100) *21;
            getal3 = getal + getal2;


            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}