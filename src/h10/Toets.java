package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Toets extends Applet {
    TextField tekstvak;
    Label label, label2, label3, label4;
    Button knop, knop2;
    double bedrag,getal,getal2, getal3;
    int perfooi;

    public void init() {
        label = new Label("Rekening bedrag");
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new TekstvakListener());
        label2 = new Label("Percentage fooi");
        knop = new Button("+");
        knop2 = new Button("-");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new KnopListener2());
        label3 = new Label("");
        label4 = new Label("");
        add(label);
        add(tekstvak);
        add(label2);
        add(knop);
        add(knop2);
        add(label3);
        add(label4);
        bedrag = 0;
        perfooi = 0;
    }
    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            perfooi++;
            label2.setText("Percentage fooi "+perfooi+"%");
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            perfooi--;
            label2.setText("Percentage fooi "+perfooi+"%");
            repaint();
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            getal2 = getal / 100 * perfooi;
            DecimalFormat df2 = new DecimalFormat("###.00");
            String getalString2 = df2.format(getal2);
            label3.setText("Fooi bedrag "+getalString2);
            getal3 = getal + getal2;
            DecimalFormat df = new DecimalFormat("###.00");
            String getalString = df.format(getal3);

            label4.setText("Totaal incl.fooi("+perfooi+"%) "+getalString);
            repaint();
        }
    }
}