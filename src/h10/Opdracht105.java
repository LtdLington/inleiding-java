package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht105 extends Applet {
    TextField tekstvak, tekstvak2, tekstvak3;
    int  getal,getal2, getal3, getal4;
    double getal5, getal6;
    Label label;
    Button knop;
    String tekst, s, s2, s3;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak2 = new TextField("",5);
        tekstvak3 = new TextField("",5);
        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );
        label = new Label("Toets cijfer in");
        tekst = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
        add(tekstvak3);
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString(tekst,50,50 );

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            s3 = tekstvak3.getText();
            getal = Integer.parseInt(s);
            getal2 = Integer.parseInt(s2);
            getal3 = Integer.parseInt(s3);
            getal4 = getal + getal2 + getal3;
            getal5 = ((double)getal4 /3);
            getal6 = (getal5 *10) /10;
            if(getal6 >= 5){
                tekst = "Gemiddelde cijfer is "+getal6+" u heeft een Voldoende";
                repaint();
            }else{
                tekst = "Gemiddelde cijfer is "+getal6+" u heeft een onvoldoende";
                repaint();
            } if(getal5 > 10){
                tekst = "Toets andere cijfers in 1-10";
                repaint();
            }

        }
    }
}
