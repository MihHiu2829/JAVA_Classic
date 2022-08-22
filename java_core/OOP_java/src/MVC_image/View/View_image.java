package MVC_image.View;

import javax.swing.*;
import java.awt.*;

public class View_image extends JFrame {
        private JLabel jLabel_display ;
    public View_image(){
        this.setTitle("View Image");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,15) ;

        JButton jButton_set_up =  new JButton("Setup jbutton") ;
        jButton_set_up.setFont(font);
        jButton_set_up.setSize(300,300);


        JMenuBar jMenuBar = new JMenuBar() ;
        JMenu jMenu_file = new JMenu("file");
        jMenu_file.setFont(font);
        JMenuItem jMenuItem_open = new JMenuItem("Open") ;
        jMenuItem_open.setFont(font);
        JMenuItem jMenuItem_close = new JMenuItem("Close")  ;
        jMenuItem_close.setFont(font);

        jMenu_file.add(jMenuItem_open);
        jMenu_file.add(jMenuItem_close);
        jMenuBar.add(jMenu_file);

        jLabel_display = new JLabel("Lam gi do di");
        Font font_1 = new Font("Arial",Font.BOLD,50) ;
        jLabel_display.setFont(font_1);

        this.setLayout(new BorderLayout());
        this.add(jLabel_display,BorderLayout.CENTER);
        this.add(jButton_set_up,BorderLayout.SOUTH);
        this.setJMenuBar(jMenuBar);

        this.setVisible(true);
    }
}
