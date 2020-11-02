package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst,tekst2;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80 );
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