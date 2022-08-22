package Java_graphic_basic;

import javax.swing.*;
import java.awt.*;

public class bai_2_view extends JFrame {
       public bai_2_view(){
//           this.setTitle("Vi du ve flow layout ");
//           this.setSize(800,600);
//           this.setLocationRelativeTo(null);
//           FlowLayout flowLayout = new FlowLayout() ;
//           FlowLayout flowLayout1 = new FlowLayout(FlowLayout.LEFT) ;
//           FlowLayout flowLayout2 = new FlowLayout(FlowLayout.LEADING,10,10) ;
//           this.setLayout(flowLayout2);
//           JButton jButton = new JButton("1");
//           JButton jButton1 = new JButton("2");
//           JButton jButton2 = new JButton("3");
//           this.add(jButton);
//           this.add(jButton1);
//           this.add(jButton2);
//
//           this.setVisible(true);
//           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           this.setTitle("Vi du ve brid layout ! ");
//           this.setSize(500,600);
//           this.setLocationRelativeTo(null);
//
//           GridLayout gridLayout = new GridLayout();
//           GridLayout gridLayout1 = new GridLayout(4,4);
//           GridLayout gridLayout2 = new GridLayout(4,4,10,10);
//           this.setLayout(gridLayout2);
//           for(int i=0;i<16;i++){
//               JButton jButton  =  new JButton(i+1+"");
//               this.add(jButton) ;
//           }
//
//           this.setVisible(true);
//           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setTitle("Vi du ve border layout ");
           this.setSize(800,700);
           this.setLocationRelativeTo(null);
           BorderLayout borderLayout = new BorderLayout();
           BorderLayout borderLayout2 = new BorderLayout(3,3);
           this.setLayout(borderLayout);
           JButton jButton_1 = new JButton("1");
           JButton jButton_2 = new JButton("2");
           JButton jButton_3 = new JButton("3");
           JButton jButton_4 = new JButton("4");
           JButton jButton_5 = new JButton("5");
           this.add(jButton_1,BorderLayout.WEST) ;
           this.add(jButton_2,BorderLayout.SOUTH) ;
           this.add(jButton_3,BorderLayout.NORTH) ;
           this.add(jButton_4,BorderLayout.EAST) ;
           this.add(jButton_5,BorderLayout.CENTER) ;
           this.setVisible(true);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    public static void main(String[] args) {
        new bai_2_view()   ;
    }
}
