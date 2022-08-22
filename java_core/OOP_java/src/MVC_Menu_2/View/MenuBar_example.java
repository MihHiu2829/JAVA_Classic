package MVC_Menu_2.View;

import MVC_Menu_2.Controll.MenuBar_Controller;

import javax.swing.*;
import java.awt.*;

public class MenuBar_example extends JFrame {

       private JLabel jLabel ;
    public MenuBar_example(){


        this.setTitle("Menu bar! ");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar() ;
        Font font = new Font("Arail",Font.BOLD,24);
        jLabel = new JLabel("Làm gì đó đi? ");
        jLabel.setFont(font);
        MenuBar_Controller ac = new MenuBar_Controller(this) ;

        JMenu jMenu_file = new JMenu("File");
        JMenuItem jMenuItem_open =  new JMenuItem("Open") ;
        jMenuItem_open.addActionListener(ac);
        JMenuItem jMenuItem_exit =  new JMenuItem("Exit") ;
        jMenuItem_exit.addActionListener(ac);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);


        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_function = new JMenuItem("Contract");
        jMenuItem_function.addActionListener(ac);
        jMenu_help.add(jMenuItem_function);


        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        this.setJMenuBar(jMenuBar);

    this.setLayout(new BorderLayout());
    this.add(jLabel);


        this.setVisible(true) ;
    }
    public void setTextJLabel(String s){
            this.jLabel.setText(s);
    }
}
