package MVC_PhimTat.View;

import MVC_PhimTat.Controller.shortCut_listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class shortCut extends JFrame {
    private JLabel jLabel_display ;
    public shortCut()  {
        this.setTitle("Short Cut");
        this.setSize(800,600) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        shortCut_listener sc = new shortCut_listener(this) ;

        Font font = new Font("Arial",Font.BOLD,15);
        JMenu jMenu_file = new JMenu("File");
        jMenu_file.setFont(font);
        JMenuItem open_file = new JMenuItem("Open",KeyEvent.VK_O) ;  //  cai phim an du
        open_file.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));  //  gan phim tat
        open_file.setFont(font);
        open_file.addActionListener(sc);
        JMenuItem close_file = new JMenuItem("Close",KeyEvent.VK_C) ;
        close_file.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        close_file.setFont(font);
        close_file.addActionListener(sc);

        JMenuItem display_name_file = new JMenuItem("Display file");
        display_name_file.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));  // cai phim tat co ban
        display_name_file.setFont(font);
        display_name_file.addActionListener(sc);


        jMenu_file.add(open_file);
        jMenu_file.addSeparator();
        jMenu_file.add(close_file);
        jMenu_file.addSeparator();
        jMenu_file.add(display_name_file);
//        jMenu_file.addSeparator();
//        jMenu_file.add(open_file);
        JMenuBar jMenuBar = new JMenuBar() ;
        jMenuBar.add(jMenu_file) ;

        JMenu jMenu_exit = new JMenu("Exit") ;
        jMenu_exit.setFont(font);
        JMenuItem jMenuItem_exit  = new JMenuItem("Exit on clsoe", KeyEvent.VK_E);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        jMenuItem_exit.setFont(font);
        jMenuItem_exit.addActionListener(sc);

        JMenuItem jMenuItem_exit_fake  = new JMenuItem("fake",KeyEvent.VK_X);
        jMenuItem_exit_fake.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));


        JToolBar jToolBar = new JToolBar() ;
        JButton jButton_Undo = new JButton("Undo") ;
        JButton jButton_Redo = new JButton("Redo") ;
        JButton jButton_Copy = new JButton("Copy") ;
        JButton jButton_Cut = new JButton("Cut") ;
        JButton jButton_Paste = new JButton("Paste") ;

        jToolBar.add(jButton_Undo);
        jButton_Undo.addActionListener(sc);
        jButton_Undo.setToolTipText("Nhan vao day de quay lai thao tac vua roi! ");
        jToolBar.add(jButton_Redo);
        jButton_Redo.addActionListener(sc);
        jToolBar.add(jButton_Copy);
        jButton_Copy.addActionListener(sc);
        jToolBar.add(jButton_Cut);
        jButton_Cut.addActionListener(sc);
        jToolBar.add(jButton_Paste);
        jButton_Paste.addActionListener(sc);



        jMenuItem_exit_fake.setFont(font);
        jMenuItem_exit_fake.addActionListener(sc);


        jMenu_exit.add(jMenuItem_exit);
        jMenu_exit.addSeparator();
        jMenu_exit.add(jMenuItem_exit_fake);

        Font font_2= new Font("Arial",Font.BOLD,50) ;

        jLabel_display = new JLabel("Action comman") ;
        jLabel_display.setFont(font_2);
        this.setLayout(new BorderLayout());
        this.add(jToolBar,BorderLayout.NORTH)  ;

        jMenuBar.add(jMenu_exit) ;
        this.setJMenuBar(jMenuBar);
        this.add(jLabel_display,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void setTextJlabel(String a){
        this.jLabel_display.setText(a);
    }
}
