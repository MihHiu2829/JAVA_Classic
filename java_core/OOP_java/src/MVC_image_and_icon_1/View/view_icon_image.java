package MVC_image_and_icon_1.View;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class view_icon_image extends JFrame {
    private URL  urlIconNodepad ;
    private JLabel jLabel_image ;
    public view_icon_image(){
        this.setSize(300,300) ;
        this.setLocationRelativeTo(null);
        this.setTitle("Hình ảnh và biểu tưởng hình ảnh");


        Font font = new Font("Arial",Font.BOLD,15) ;
        Font fonnt = new Font("Times New Roman",Font.BOLD,35) ;
        JMenuBar jMenuBar_funtion = new JMenuBar() ;
        JMenu jMenu_item_a = new JMenu("A") ;
        jMenu_item_a.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("Letter-A-icon.png"))));
        jMenu_item_a.setFont(font);
        JMenu jMenu_item_b  = new JMenu("B");
        jMenu_item_b.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("Letter-B-icon.png")))) ;

        jMenu_item_b.setFont(font);


        // set Icon ;
         urlIconNodepad = view_icon_image.class.getResource("image.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNodepad) ;
        this.setIconImage(img);

        JMenuItem jMenuItem_a01 =  new JMenuItem("01")  ;
        jMenuItem_a01.setFont(font);
        jMenuItem_a01.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("Snowflake-icon.png"))));
        jMenu_item_a.add(jMenuItem_a01);
        jMenu_item_a.addSeparator();
        JMenuItem jMenuItem_a02 =  new JMenuItem("02")  ;
        jMenuItem_a02.setFont(font);
        jMenuItem_a02.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("atom-icon.png"))));
        jMenu_item_a.addSeparator();
        jMenu_item_a.add(jMenuItem_a02);
        JMenuItem jMenuItem_a03 =  new JMenuItem("03")  ;
        jMenuItem_a03.setFont(font);
        jMenuItem_a03.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("One-Finger-icon.png"))));
        jMenu_item_a.addSeparator();
        jMenu_item_a.add(jMenuItem_a03);
        JMenuItem jMenuItem_a04 =  new JMenuItem("04")  ;
        jMenuItem_a04.setFont(font);
        jMenuItem_a04.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("Snowflake-icon.png"))));
        jMenu_item_a.addSeparator();
        jMenu_item_a.add(jMenuItem_a04);
        JMenuItem jMenuItem_b01 =  new JMenuItem("Không một")  ;
        jMenuItem_b01.setFont(font);
        jMenuItem_b01.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("TV-Movie-Krustys-heart-attack-icon.png"))));
        jMenu_item_b.addSeparator();
        jMenu_item_b.add(jMenuItem_b01);
        JMenuItem jMenuItem_b02 =  new JMenuItem("Không hai")  ;
        jMenuItem_b02.setFont(font);
        jMenuItem_b02.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("Snowflake-icon.png"))));
        jMenu_item_b.add(jMenuItem_b02);

        jMenuBar_funtion.add(jMenu_item_a);
        jMenuBar_funtion.add(jMenu_item_b);

        JButton jButton_funtion_click =  new JButton("Click") ;
        jButton_funtion_click.setFont(fonnt);
        jLabel_image = new JLabel() ;
        jLabel_image.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view_icon_image.class.getResource("2457212.jpg"))));
        this.setLayout(new BorderLayout());
        this.add(jButton_funtion_click,BorderLayout.SOUTH);
        this.add(jLabel_image,BorderLayout.CENTER);
        this.setJMenuBar(jMenuBar_funtion);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
