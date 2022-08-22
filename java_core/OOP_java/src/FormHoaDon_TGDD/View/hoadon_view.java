package FormHoaDon_TGDD.View;

import javax.swing.*;
import java.awt.*;

public class hoadon_view extends JFrame {
    public hoadon_view()
    {
            this.setSize(900,1200);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel jLabel_capany = new JLabel("Công ty cổ phần Thế Giới Di Động " +
                    "112 Đinh Tiên Hoàng, phường Đa Kao, Quận 1, Thành Phố Hồ Chí Minh. ");






        jLabel_capany.setBackground(Color.PINK);
        jLabel_capany.setOpaque(true);
            this.setLayout(new BorderLayout());

//            this.setBackground(Color.pink) ;
            this.add(jLabel_capany, BorderLayout.NORTH);
            this.setVisible(true);
    }

}
