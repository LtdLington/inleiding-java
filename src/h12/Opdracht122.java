package h12;
import java.awt.*;
import java.applet.*;

public class Opdracht122 extends Applet {
        Button[] knop;

        public void init() {
            knop = new Button[25];
            for (int teller = 0; teller < 25; teller ++) {
                knop[teller] = new Button("");
                add(knop[teller]);
            }
        }
        public void paint(Graphics g) {
        }
    }
