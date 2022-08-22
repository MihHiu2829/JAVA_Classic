package MVC_example_mouse_3.View;

import MVC_example_mouse_3.Controller.controll_mouse;
import MVC_example_mouse_3.Model.model_mouse;

import javax.swing.*;
import java.awt.*;

public class view_mouse extends JFrame {
    private model_mouse model ;
    private JLabel tounch_bar_mouse ;
    private JLabel count_click ;
    private JLabel coordinate ;
    private JLabel outsize ;


    public view_mouse() throws HeadlessException {
        this.model = new model_mouse() ;
        this.init() ;
        this.setVisible(true);
    }

    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setTitle("Mouse motion");

        Font font = new Font("Arial", Font.BOLD,40);
        Font font_1 = new Font("Arial",Font.BOLD,56) ;

        JPanel jPanel_funtion = new JPanel() ;
        jPanel_funtion.setLayout(new GridLayout(1,2));
        controll_mouse cm = new controll_mouse(this);


        tounch_bar_mouse = new JLabel() ;
        tounch_bar_mouse.setBackground(Color.WHITE);
        tounch_bar_mouse.setOpaque(true);
        tounch_bar_mouse.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        tounch_bar_mouse.addMouseMotionListener(cm);
        tounch_bar_mouse.addMouseListener(cm);


        JPanel jPanel_left = new JPanel() ;
        jPanel_left.setLayout(new FlowLayout());
        coordinate = new JLabel("X:      Y:  ")  ;
        coordinate.setFont(font_1);
        jPanel_left.add(coordinate);
        jPanel_left.setBackground(Color.ORANGE);
        jPanel_left.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));

        JPanel jPanel_right = new JPanel();
        jPanel_right.setLayout(new GridLayout(2,1));
        count_click = new JLabel("Number of click : 0");
        count_click.setFont(font);
        outsize = new JLabel("Out size : null");
        outsize.setFont(font);
        jPanel_right.add(count_click);
        jPanel_right.add(outsize);
        jPanel_right.setBackground(Color.ORANGE);
        jPanel_right.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));


        jPanel_funtion.add(jPanel_left);
        jPanel_funtion.add(jPanel_right);

        this.setLayout(new BorderLayout());
        this.add(tounch_bar_mouse,BorderLayout.CENTER);
        this.add(jPanel_funtion,BorderLayout.SOUTH);

    }

    public void addClick(){
        this.model.addClick();
        this.count_click.setText("Number of click : "+ this.model.getCount());
    }
    public void exit(){
        this.model.exit();
        this.outsize.setText("Out size : "+ this.model.getCheckIn());
    }
    public void enter(){
        this.model.enter();
        this.outsize.setText("Out size : "+this.model.getCheckIn());
    }
    public void update(int x,int y){
        this.model.setX(x);
        this.model.setY(y);
        this.coordinate.setText("X: "+this.model.getX()+" Y: "+ this.model.getX());
    }
}
