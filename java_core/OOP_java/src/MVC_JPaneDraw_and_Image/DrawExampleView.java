package MVC_JPaneDraw_and_Image;

import javax.swing.*;
import java.awt.*;

public class DrawExampleView extends JFrame {
    public DrawExampleView(){
        this.setTitle("Draw Example ");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        jPanel_draw jPanel_draw = new jPanel_draw();

        this.setLayout(new BorderLayout());
        this.add(jPanel_draw,BorderLayout.CENTER) ;
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawExampleView();
    }
}
