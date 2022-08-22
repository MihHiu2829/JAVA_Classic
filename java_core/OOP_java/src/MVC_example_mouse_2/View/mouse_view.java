package MVC_example_mouse_2.View;

import MVC_example_mouse_2.Controller.mouse_controller;
import MVC_example_mouse_2.Model.mouse_model;

import javax.swing.*;
import java.awt.*;

public class mouse_view extends JFrame {
    private mouse_model mouseModel ;
    private JPanel jPanel_center;
    private JLabel jLabel_x  ;
    private JLabel jLabel_y  ;
    private JLabel jLabel_count  ;
    private JLabel jLabel_count_value  ;
    private JLabel jLabel_check_in  ;
    private JLabel jLabel_checkin_value  ;

    public mouse_view(){
        this.mouseModel = new mouse_model();
        this.init();
        this.setVisible(true);
    }

    public void  init(){
        this.setTitle("Hệ quản trị con trỏ chuột! ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,40);
        mouse_controller mc = new mouse_controller(this)  ;


        jPanel_center = new JPanel();
        jPanel_center.setBackground(Color.cyan);
        jPanel_center.addMouseListener(mc);
        jPanel_center.addMouseMotionListener(mc);


        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3)) ;

        JLabel jLabel_position = new JLabel("Positon: ");
        jLabel_position.setFont(font);
        jLabel_x = new JLabel("X =");
        jLabel_x.setFont(font);

        jLabel_y = new JLabel("Y = ");
        jLabel_y.setFont(font);

        jLabel_count = new JLabel("Number of clicks ") ;
        jLabel_count.setFont(font);

        jLabel_count_value = new JLabel();
        jLabel_count_value.setFont(font);

        JLabel jLabel_empty_1 = new JLabel();
        jLabel_check_in = new JLabel("Mouse is int compoment:  ");
        jLabel_check_in.setFont(font);

        jLabel_checkin_value = new JLabel() ;
        jLabel_checkin_value.setFont(font);

        JLabel jLabel_empty_2 = new JLabel() ;

        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_checkin_value);
        jPanel_info.add(jLabel_empty_2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_center,BorderLayout.CENTER);
        this.add(jPanel_info,BorderLayout.SOUTH);

    }
    public void addClick(){
        this.mouseModel.addClick();
        this.jLabel_count_value.setText(this.mouseModel.getCount()+"");
    }

        public void enter(){
        this.mouseModel.enter();
        this.jLabel_check_in.setText(this.mouseModel.getCheckIn());
        }

        public void exit(){

        this.mouseModel.exit();
        this.jLabel_check_in.setText(this.mouseModel.getCheckIn());

        }
        public void update(int x,int y){
            this.mouseModel.setX(x);
            this.mouseModel.setY(y);
            this.jLabel_x.setText(this.mouseModel.getX()+"");
            this.jLabel_y.setText(this.mouseModel.getY()+"");
        }

}
