package MVC_phim_tat_3.View;

import MVC_phim_tat_3.Controller.controller_phim_tat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class view_phim_tat extends JFrame {
    private JLabel jLabel_notification ;
    public JPopupMenu jPopupMenu ;
       public view_phim_tat(){
           this.setTitle("Phim Tat");
           this.setSize(1000,900) ;
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null);


           controller_phim_tat ac = new controller_phim_tat(this) ;


           JMenuBar jMenuBar = new JMenuBar() ;
           JMenu jMenu_file = new JMenu("File") ;
           JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
           jMenuItem_open.addActionListener(ac);
           jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
           JMenuItem jMenuItem_display = new JMenuItem("Display",KeyEvent.VK_D);
           jMenuItem_display.addActionListener(ac);
           jMenuItem_display.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
           JMenuItem jMenuItem_close = new JMenuItem("Close");
           jMenuItem_close.addActionListener(ac);
           jMenuItem_close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
           jMenu_file.add(jMenuItem_open);
           jMenu_file.add(jMenuItem_display);
           jMenu_file.add(jMenuItem_close);


           JMenu jMenu_Exit = new JMenu("Exit") ;
           JMenuItem jMenuItem_exit = new JMenuItem("Exit out program",KeyEvent.VK_E) ;
           jMenuItem_exit.addActionListener(ac);
           JMenuItem jMenuItem_Dont_exit = new JMenuItem("Dont exit! ",KeyEvent.VK_N) ;
           jMenuItem_Dont_exit.addActionListener(ac);

           jMenu_Exit.add(jMenuItem_exit);
           jMenu_Exit.add(jMenuItem_Dont_exit);

           jMenuBar.add(jMenu_file);
           jMenuBar.add(jMenu_Exit);


           JToolBar jToolBar = new JToolBar("Thanh cong cu") ;
           JButton jButton_undo = new JButton("Undo");
           jButton_undo.addActionListener(ac);
           JButton jButton_copy = new JButton("Copy");
           jButton_copy.addActionListener(ac);
           JButton jButton_paste = new JButton("Paste");
           jButton_paste.addActionListener(ac);
           JButton jButton_cut = new JButton("Cut");
           jButton_cut.addActionListener(ac);
           JButton jButton_push = new JButton("Push");
           jButton_push.addActionListener(ac);

           jToolBar.add(jButton_undo);
           jToolBar.add(jButton_copy);
           jToolBar.add(jButton_paste);
           jToolBar.add(jButton_cut);
           jToolBar.add(jButton_push);


           jLabel_notification = new JLabel("Lam gi do di");
            this.setLayout(new BorderLayout());
            this.add(jLabel_notification,BorderLayout.CENTER) ;
            this.add(jToolBar,BorderLayout.NORTH) ;
           this.setJMenuBar(jMenuBar);

           jPopupMenu = new JPopupMenu() ;
           JMenu jMenuPoupFont = new JMenu("Font");
           JMenuItem jMenuItemType = new JMenuItem("Type");
           JMenuItem jMenuItemSite = new JMenuItem("Font");
           jMenuPoupFont.add(jMenuItemType);
           jMenuPoupFont.add(jMenuItemSite);

           // them su kien phai chuot vao Jlabel


           JMenuItem jMenuItemCut = new JMenuItem("Cut");
           JMenuItem jMenuItemCopy = new JMenuItem("Copy");
           JMenuItem jMenuItemPaste = new JMenuItem("Paste");

           jPopupMenu.add(jMenuPoupFont);
           jPopupMenu.add(jMenuItemCut);
           jPopupMenu.add(jMenuItemCopy);
           jPopupMenu.add(jMenuItemPaste);

            this.addMouseListener(ac); ;
            this.add(jPopupMenu) ;

           this.setVisible(true);
       }
       public void setTExt_jlabel(String a){
           jLabel_notification.setText(a);
       }
}
