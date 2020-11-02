package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk10 extends Applet {
    TextField tekstvak;
    int getal;
    String tekst;
    Label label;

    public void init() {
        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Toets je cijfer in. 1-10");
        getal = 0;
        tekst = "";
        add(tekstvak);
        add(label);
    }
    public void paint(Graphics g) {
        g.drawString(tekst,50,50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if(getal <= 3){
                tekst = "Slecht";
                repaint();
            }
            if(getal == 4){
                tekst = "Onvoldoende";
                repaint();
            }
            if(getal == 5){
                tekst = "Matig";
                repaint();
            }
            if(getal >= 6){
                tekst = "voldoende";
                repaint();
            }
            if(getal >= 8){
                tekst = "goed";
                repaint();
            }
            if(getal > 10){
                tekst = getal+" is hoger dan 10, typ iets anders";
                repaint();
            }
        }
    }
}