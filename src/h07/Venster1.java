package h07;

import java.awt.*;
import java.applet.*;

public class Venster1 extends Applet {

    public void init() {
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60);
    }
}