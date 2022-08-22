package MVC_example_mouse.View;

import MVC_example_mouse.Controller.Mouse_example_controller;
import MVC_example_mouse.Model.Mouse_example;

import javax.swing.*;
import java.awt.*;

public class Mouse_example_view extends JFrame {
    private Mouse_example model ;
    private JPanel jPanel_mouse;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count_value;
    private JLabel jLabel_count;
    private JLabel jLabel_check_in;
    private JLabel jLabel_checkin_value;


    public Mouse_example_view() throws HeadlessException {
        this.model = new Mouse_example();
        this.init() ;
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Mouse example! ");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Mouse_example_controller mc = new Mouse_example_controller(this);
        Font font = new Font("Arial",Font.BOLD,40);

         jPanel_mouse = new JPanel() ;
        jPanel_mouse.setBackground(Color.cyan);
         jPanel_mouse.addMouseListener(mc);
        jPanel_mouse.addMouseMotionListener(mc);

        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3));

        JLabel jLabel_position = new JLabel("Position: ");
        jLabel_position.setFont(font);
         jLabel_x = new JLabel("X = ") ;
        jLabel_x.setFont(font);

        jLabel_y = new JLabel("Y = ") ;
        jLabel_y.setFont(font);

        jLabel_count = new JLabel("Number of  clicks") ;
        jLabel_count.setFont(font);

        jLabel_count_value = new JLabel() ;
        jLabel_count_value.setFont(font);

        JLabel jLabel_empty_1 = new JLabel();
         jLabel_check_in = new JLabel("Mouse is in component: ");
        jLabel_check_in.setFont(font);

        jLabel_checkin_value = new JLabel() ;
        jLabel_checkin_value.setFont(font);

        JLabel jLabel_empty_2 = new JLabel();

        jPanel_info.add(jLabel_position) ;
        jPanel_info.add(jLabel_x) ;
        jPanel_info.add(jLabel_y) ;
        jPanel_info.add(jLabel_count) ;
        jPanel_info.add(jLabel_count_value) ;
        jPanel_info.add(jLabel_empty_1) ;
        jPanel_info.add(jLabel_check_in) ;
        jPanel_info.add(jLabel_checkin_value) ;
        jPanel_info.add(jLabel_empty_2) ;

        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse,BorderLayout.CENTER);
        this.add(jPanel_info,BorderLayout.SOUTH);
    }

    public void addClick(){
        this.model.addClick();
        this.jLabel_count_value.setText(this.model.getCount()+"");
    }
    public void enter(){
       this.model.enter();
       this.jLabel_check_in.setText(this.model.getCheckIn());

    }
    public void exit(){

        this.model.exit();
        this.jLabel_check_in.setText(this.model.getCheckIn());

    }
  public void update(int x,int y){
        this.model.setX(x);
        this.model.setY(y);
      this.jLabel_x.setText(this.model.getX()+"");
      this.jLabel_y.setText(this.model.getY()+"");
  }
}
