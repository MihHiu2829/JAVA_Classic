package MVC_Menu.View;

import MVC_Menu.controller.MenuExampleController;

import javax.swing.*;
import java.awt.*;

public class MenuExample extends JFrame {

    private  JLabel jLabel;

    public MenuExample() throws HeadlessException {
        this.setTitle("Menu example");
        this.setSize(500,500) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
         // tao controller
        MenuExampleController ac = new MenuExampleController(this) ;


        // tao thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        // tao 1 menu
        JMenu jMenu_1 = new JMenu("File");
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(ac);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(ac);

        jMenu_1.add(jMenuItem_open);
        jMenu_1.addSeparator();  // tạo gạch ngang, trông thanh menu !
        jMenu_1.add(jMenuItem_exit);


        JMenu jMenu_2 = new JMenu("Help");
        JMenuItem jMenuItem_welcomme = new JMenuItem("Welcone");
        jMenuItem_welcomme.addActionListener(ac);
        jMenu_2.add(jMenuItem_welcomme);


        jMenuBar.add(jMenu_1);
        jMenuBar.add(jMenu_2);


        this.setJMenuBar(jMenuBar);


        Font font = new Font("Arial",Font.BOLD,50) ;
         jLabel = new JLabel();
         jLabel.setFont(font);



        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setTextJlabel(String s){
        this.jLabel.setText(s);
    }



}
