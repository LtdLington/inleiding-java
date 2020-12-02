package h12;
import java.awt.*;
import java.applet.*;

public class Test extends Applet {
    double salaris[];
    double gemiddeld, totaal;

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        for (int teller = 0; teller < salaris.length; teller ++) {
            totaal += salaris[teller];
        }
        for (int teller = 0; teller < salaris.length; teller ++) {
            gemiddeld = totaal / salaris.length;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("Totaal is: "+totaal, 50, 240);
            g.drawString("Gemiddelde is: "+gemiddeld, 50, 260);
        }
    }
}