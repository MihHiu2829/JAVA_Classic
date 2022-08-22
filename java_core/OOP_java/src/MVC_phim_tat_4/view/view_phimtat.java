package MVC_phim_tat_4.view;

import MVC_phim_tat_4.controller.controller_phimtat;
import MVC_phim_tat_4.controller.controoler_chuot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class view_phimtat extends JFrame {
    private JLabel jLabel_view ;
    public JPopupMenu jPopupMenu ;

    public view_phimtat(){
        this.setTitle("Phim tat trong giao dien! ");
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,12);
        Font font_1 = new Font("Times New Roman",Font.PLAIN,12) ;

        controller_phimtat ac = new controller_phimtat(this) ;

        JMenuBar jMenuBar_funtion = new JMenuBar() ;
        jMenuBar_funtion.setFont(font);



        JMenu jMenu_file = new JMenu("File");
        jMenu_file.setFont(font);

        JMenu jMenu_home = new JMenu("Home") ;
        jMenu_home.setFont(font);

        JMenu jMenu_share = new JMenu("Share");
        jMenu_share.setFont(font);

        JMenu jMenu_view = new JMenu("View");
        jMenu_view.setFont(font);



        JMenuItem jMenuItem_1 = new JMenuItem("1");
        jMenuItem_1.setFont(font_1);
        jMenuItem_1.addActionListener(ac);
        JMenuItem jMenuItem_2 = new JMenuItem("2");
        jMenuItem_2.addActionListener(ac);
        jMenuItem_2.setFont(font_1);
        JMenuItem jMenuItem_3 = new JMenuItem("3");
        jMenuItem_3.addActionListener(ac);
        jMenuItem_3.setFont(font_1);
        JMenuItem jMenuItem_4 = new JMenuItem("4");
        jMenuItem_4.addActionListener(ac);
        jMenuItem_4.setFont(font_1);
        JMenuItem jMenuItem_5 = new JMenuItem("5");
        jMenuItem_5.addActionListener(ac);
        jMenuItem_5.setFont(font_1);
        JMenuItem jMenuItem_6 = new JMenuItem("6");
        jMenuItem_6.addActionListener(ac);
        jMenuItem_6.setFont(font_1);
        JMenuItem jMenuItem_7 = new JMenuItem("7");
        jMenuItem_7.addActionListener(ac);
        jMenuItem_7.setFont(font_1);
        JMenuItem jMenuItem_8 = new JMenuItem("8");
        jMenuItem_8.addActionListener(ac);
        jMenuItem_8.setFont(font_1);
        JMenuItem jMenuItem_9 = new JMenuItem("9");
        jMenuItem_9.addActionListener(ac);
        jMenuItem_9.setFont(font_1);
        JMenuItem jMenuItem_10 = new JMenuItem("10");
        jMenuItem_10.addActionListener(ac);
        jMenuItem_10.setFont(font_1);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit") ;
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_exit.addActionListener(ac);
        jMenuItem_exit.setFont(font_1);


        JButton jButton_copy = new JButton("Copy");
        jButton_copy.setFont(font);
        jButton_copy.addActionListener(ac);
        JButton jButton_undo = new JButton("Undo");
        jButton_undo.setFont(font);
        jButton_undo.addActionListener(ac);
        JButton jButton_paste = new JButton("Paste");
        jButton_paste.setFont(font);
        jButton_paste.addActionListener(ac);



        JToolBar jToolBar = new JToolBar("Phim chuc nang:)") ;
        jToolBar.add(jButton_copy);
        jToolBar.add(jButton_undo);
        jToolBar.add(jButton_paste);

        jMenu_file.add(jMenuItem_1);
        jMenu_file.add(jMenuItem_2);

        jMenu_home.add(jMenuItem_3);
        jMenu_home.add(jMenuItem_4);

        jMenu_share.add(jMenuItem_5);
        jMenu_share.add(jMenuItem_6);
        jMenu_share.add(jMenuItem_7);

        jMenu_view.add(jMenuItem_8);
        jMenu_view.add(jMenuItem_9);
        jMenu_view.add(jMenuItem_10);
        jMenu_view.add(jMenuItem_exit);

        // Menu chuot phai JPopupMenu
        jPopupMenu = new JPopupMenu() ;

        JMenu jMenuPoupFont = new JMenu("Font");
        JMenuItem jMenuItemTypde = new JMenuItem("Type");
        JMenuItem jMenuItemSize = new JMenuItem("Size");
        jMenuPoupFont.add(jMenuItemTypde);
        jMenuPoupFont.add(jMenuItemSize);

        jPopupMenu.add(jMenuPoupFont) ;

        jLabel_view = new JLabel("Lam gi do di ! ");
        jLabel_view.setFont(font_1);

        jMenuBar_funtion.add(jMenu_file);
        jMenuBar_funtion.add(jMenu_home);
        jMenuBar_funtion.add(jMenu_share);
        jMenuBar_funtion.add(jMenu_view);

        controoler_chuot mc = new controoler_chuot(this);
        this.addMouseListener(mc);

        this.setJMenuBar(jMenuBar_funtion);
        this.setLayout(new BorderLayout());
        this.add(jLabel_view,BorderLayout.CENTER)  ;
        this.add(jToolBar,BorderLayout.NORTH);
        this.add(jPopupMenu) ;
        this.setVisible(true);
    }
    public void setText_view(String a){
        this.jLabel_view.setText(a);
    }
}
