package MVC_JscrollArea.View;

import MVC_JscrollArea.Controller.controll_ScrollPanel;
import MVC_JscrollArea.Model.model_ScrollPanel;

import javax.swing.*;
import java.awt.*;
import java.text.FieldPosition;

public class view_SrcollPanel extends JFrame {
    private model_ScrollPanel msl ;
   private JTextArea text  ;
   private JTextField keyword ;
   private JLabel result ;
    public view_SrcollPanel()  {
         this.msl = new model_ScrollPanel();
         this.init() ;
         this.setVisible(true);
    }
    public void init(){
        this.setTitle("Cách sử dụng srcollPanel trong java cơ bản!  ");
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial",Font.BOLD,40) ;
        controll_ScrollPanel ac = new controll_ScrollPanel(this);


        JLabel jPanel_text = new JLabel("Văn bản");
        jPanel_text.setFont(font);
        text = new JTextArea("Viểt vào đây cái gì đó đi? ",10,10);
        text.setFont(font);
        JScrollPane jScrollPane = new JScrollPane(text);
        jScrollPane.createHorizontalScrollBar();

        JLabel jLabel_keyword = new JLabel("Từ khóa:");
        jLabel_keyword.setFont(font);
        keyword = new JTextField(10) ;
        keyword.setFont(font);

        JButton jButton = new JButton("Thống kê");
        jButton.setFont(font);
        jButton.setBackground(Color.cyan);
        jButton.addActionListener(ac);
        result = new JLabel();
        result.setFont(font);

        JPanel jPanel_function = new JPanel() ;
        jPanel_function.setLayout(new GridLayout(2,2));
        jPanel_function.add(jLabel_keyword);
        jPanel_function.add(keyword);
        jPanel_function.add(jButton);
        jPanel_function.add(result);

         this.setLayout(new BorderLayout());
        this.add(jPanel_text,BorderLayout.NORTH) ;
        this.add(jScrollPane,BorderLayout.CENTER) ;
        this.add(jPanel_function,BorderLayout.SOUTH) ;

    }
    public void Timkiem(){
        this.msl.setText(this.text.getText());
        this.msl.setKeyword(this.keyword.getText());
     this.msl.timkiem();
     this.result.setText(this.msl.getResult());
    }
}
