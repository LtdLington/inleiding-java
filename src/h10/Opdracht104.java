package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht104 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label, label2;
    String s,s2,tekst,tekst2, tekst3;
    int dag, jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label2 = new Label("Type het jaartal en druk op enter");
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener2() );
        tekst = "";
        tekst2 = "";
        tekst3 = "";
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80 );
        g.drawString(tekst3, 50, 100 );
    }
    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt(s2);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst3 = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst3 = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari";
                    tekst2 = "Heeft 28 dagen";
                    break;
                case 3:
                    tekst = "Maart";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April";
                    tekst2 = "Heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni";
                    tekst2 = "Heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus";
                    tekst2 = "Heeft 30 dagen";
                    break;
                case 9:
                    tekst = "September";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 10:
                    tekst = "Oktober";
                    tekst2 = "heeft 30 dagen";
                    break;
                case 11:
                    tekst = "November";
                    tekst2 = "Heeft 31 dagen";
                    break;
                case 12:
                    tekst = "December";
                    tekst2 = "Heeft 30 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    tekst2 = "";
                    break;
            }
            repaint();
        }
    }
}