package MVC_JPaneDraw_and_Image;

import javax.swing.*;
import java.awt.*;

public class jPanel_draw extends JFrame {
    public jPanel_draw() {

        this.setBackground(Color.WHITE);
    }

    @Override
    public void paintAll(Graphics g) {
        super.paintAll(g);
        g.setColor(Color.red);
        g.drawLine(15,15,50,150);
    }
}
