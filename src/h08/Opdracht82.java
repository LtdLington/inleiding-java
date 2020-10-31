package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht82 extends Applet {
    Button knop, knop2, knop3, knop4, knop5;
    int g, g2, g3, g4,g5;
    String s, s2, s3, s4,s5;



    public void init() {
        knop = new Button("man");
        knop.addActionListener( new KnopListener() );
        add(knop);
        knop2 = new Button("vrouw");
        knop2.addActionListener( new KnopListener2() );
        add(knop2);
        knop3 = new Button("man student");
        knop3.addActionListener( new KnopListener3() );
        add(knop3);
        knop4 = new Button("vrouw student");
        knop4.addActionListener( new KnopListener4() );
        add(knop4);
        knop5 = new Button("Totaal");
        knop5.addActionListener( new KnopListener5() );
        add(knop5);
        s ="";
        s2 ="";
        s3 ="";
        s4 ="";
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen "+s,100,100);
        g.drawString("Aantal vrouwen "+s2,100,120);
        g.drawString("Aantal man student "+s3,100,140);
        g.drawString("Aantal vrouwen student "+s4,100,160);
        g.drawString("Totaal "+g5,100,180);
    }
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            g++;
           s =""+g;
            repaint();
        }
    }
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            g2++;
            s2 =""+g2;
            repaint();
        }
    }
    class KnopListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            g3++;
            s3 =""+g3;
            repaint();
        }
    }
    class KnopListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            g4++;
            s4 =""+g4;
            repaint();
        }
    }
    class KnopListener5 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            g5 = g + g2 + g3 + g4;
            s5 =""+g5;
            repaint();
        }
    }
}
