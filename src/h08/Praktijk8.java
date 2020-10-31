package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk8 extends Applet {
    TextField tekstvak, tekstvak2;
    Button knop, knop2,knop3,knop4;
    double getal,getal2,som;


    public void init() {
        tekstvak = new TextField("",20);
        tekstvak2 = new TextField("",20);
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener2() );
        knop = new Button("*");
        knop2 = new Button("/");
        knop3 = new Button("+");
        knop4 = new Button("-");
        knop.addActionListener( new KnopListener() );
        knop2.addActionListener( new KnopListener2() );
        knop3.addActionListener( new KnopListener3() );
        knop4.addActionListener( new KnopListener4() );
        add(tekstvak);
        add(tekstvak2);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
    }
    public void paint(Graphics g) {
        //g.drawString("Het ingevoerde bedrag is " + getal, 50, 60 );
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String s2 = tekstvak.getText();
            getal2 = Double.parseDouble(s2);
            som = getal * getal2;
            tekstvak.setText(""+som);
            tekstvak2.setText(" ");
            repaint();
        }
    }

    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            som = getal / getal2;
            tekstvak.setText(""+som);
            tekstvak2.setText(" ");
           repaint();
        }
    }

    class KnopListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            som = getal + getal2;
            tekstvak.setText(""+som);
            tekstvak2.setText(" ");
            repaint();

            repaint();
        }
    }

    class KnopListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            getal2 = Double.parseDouble(s2);
            som = getal - getal2;
            tekstvak.setText(""+som);
            tekstvak2.setText(" ");
            repaint();

            repaint();
        }
    }

}