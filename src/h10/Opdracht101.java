package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht101 extends Applet {

    int getal,getal2;
    TextField tekstvak;
    Label label,label2;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        label = new Label("");
        label2 = new Label("" );
        add( label );
        add( label2 );
        add( tekstvak );
        getal2 = 0;
        tekst = "Typ een getal hoger dan het huidige ";
    }

    public void paint(Graphics g) {
        g.drawString(" "+tekst,50,50);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > getal2 ) {
                getal2=getal;
                label.setText("Huidig hoogste getal is "+getal);
                repaint();
            }
        }
    }
}
