package FOnt.MVC_4.view;

import FOnt.MVC_3.controller.controller_footer;
import FOnt.MVC_4.controller.controller_fonter;
import FOnt.MVC_4.model.model_fonter;
import com.sun.jdi.Value;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view_fonter extends JFrame {
    private model_fonter model_fonter ;
    private JButton jButton_1  ;
    private JButton jButton_2  ;
    private JButton jButton_3  ;
    private JButton jButton_4  ;
    private JLabel jLabel ;

    public view_fonter(){
        model_fonter = new model_fonter() ;
        this.init() ;
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Font nao dep ne! ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600) ;
        this.setLocationRelativeTo(null) ;
        ActionListener ac = new controller_fonter(this);
        Font font = new Font("Arial",Font.BOLD,30) ;
        Font font2 = new Font("Times New Roman",Font.BOLD,50) ;
        jLabel = new JLabel("Xin chao.Hay viet gi do!",JLabel.CENTER);
        jLabel.setFont(font2);
        jButton_1 = new JButton("1") ;
        jButton_1.setFont(font);
        jButton_1.addActionListener(ac);

        jButton_2 =  new JButton("2") ;
        jButton_2.setFont(font);
        jButton_2.addActionListener(ac);

        jButton_3 =  new JButton("3") ;
        jButton_3.setFont(font);
        jButton_3.addActionListener(ac);

        jButton_4 =  new JButton("4") ;
        jButton_4.setFont(font);
        jButton_4.addActionListener(ac);
        JPanel jPanel_fonter = new JPanel() ;
        jPanel_fonter.setLayout(new GridLayout(2,2));
        jPanel_fonter.add(jButton_1);
        jPanel_fonter.add(jButton_2);
        jPanel_fonter.add(jButton_3);
        jPanel_fonter.add(jButton_4);
        this.setLayout(new BorderLayout());
        this.add(jPanel_fonter,BorderLayout.CENTER);
        this.add(jLabel,BorderLayout.NORTH);
    }
    public void PRINTFs(String a){
        this.model_fonter.setValue(a);
        this.jLabel.setText(this.model_fonter.getValue()) ;

    }




}
