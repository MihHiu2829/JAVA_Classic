package MVC_PhimTat_2.View;

import MVC_PhimTat_2.Controll.controll_phim_tat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class view_phim_tat extends JFrame {
    private JLabel jLabel_notification ;
    public view_phim_tat(){
        this.setTitle("Phim tat");
        this.setSize(1000,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,12);
        jLabel_notification = new JLabel("Lam gi do toi di ");
        jLabel_notification.setFont(font);

        controll_phim_tat ac =  new controll_phim_tat(this) ;

        JMenuBar jMenuBar = new JMenuBar() ;
        JMenu jMenu_file =  new JMenu("File")  ;
        jMenu_file.setFont(font);
        JMenuItem funtion_open = new JMenuItem("Open", KeyEvent.VK_O) ;
        funtion_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        funtion_open.setFont(font);
        funtion_open.addActionListener(ac);
        JMenuItem funtion_close = new JMenuItem("Close",KeyEvent.VK_C) ;
        funtion_close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JToolBar jToolBar = new JToolBar("thanh cong cu") ;

        JButton jButton_undo = new JButton("Undo");
        jButton_undo.addActionListener(ac);
        jButton_undo.setToolTipText("lam gi do di");
        JButton jButton_redo = new JButton("Redo");
        jButton_redo.addActionListener(ac);
        jButton_redo.setToolTipText("lam gi do di");
        JButton jButton_copy = new JButton("Copy");
        jButton_copy.addActionListener(ac);
        jButton_copy.setToolTipText("lam gi do di");
        JButton jButton_cut = new JButton("Cut");
        jButton_cut.addActionListener(ac);
        jButton_cut.setToolTipText("lam gi do di");
        JButton jButton_paste = new JButton("Paste");
        jButton_paste.addActionListener(ac);
        jButton_paste.setToolTipText("lam gi do di");


        jToolBar.add(jButton_undo);

        jToolBar.add(jButton_redo);
        jToolBar.add(jButton_copy);
        jToolBar.add(jButton_cut);
        jToolBar.add(jButton_paste);

        funtion_close.setFont(font);
        funtion_close.addActionListener(ac);
        JMenuItem funtion_display = new JMenuItem("Display",KeyEvent.VK_D) ;
        funtion_display.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        funtion_display.setFont(font);
        funtion_display.addActionListener(ac);

        funtion_display.setFont(font);
        jMenu_file.add(funtion_open)  ;
        jMenu_file.addSeparator();
        jMenu_file.add(funtion_close)  ;
        jMenu_file.addSeparator();
        jMenu_file.add(funtion_display)  ;


        JMenu jMenu_exit = new JMenu("Exit") ;
        JMenuItem funtion_exit = new JMenuItem("Exit",KeyEvent.VK_E) ;
        funtion_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        funtion_exit.setFont(font);
        funtion_exit.addActionListener(ac);
        JMenuItem funtion_show = new JMenuItem("Show",KeyEvent.VK_S) ;
        funtion_show.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        funtion_show.setFont(font);
        funtion_show.addActionListener(ac);


        jMenu_exit.add(funtion_exit) ;
        jMenu_exit.addSeparator();
        jMenu_exit.add(funtion_show) ;



        jMenuBar.add(jMenu_file) ;
        jMenuBar.add(jMenu_exit) ;

//        this.setLayout(new BorderLayout());
        this.setJMenuBar(jMenuBar);
        this.setLayout(new BorderLayout());
        this.add(jLabel_notification) ;
        this.add(jToolBar,BorderLayout.NORTH) ;
        this.setVisible(true);
    }
    public void setText_jlabel(String a){
        this.jLabel_notification.setText(a);
    }
}
