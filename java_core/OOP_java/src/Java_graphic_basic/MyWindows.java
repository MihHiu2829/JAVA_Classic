package Java_graphic_basic;

import javax.swing.*;
import java.util.Random;

public class MyWindows extends JFrame {
  public MyWindows(){

  }
    public void Show(){
      this.setVisible(true);
  }
  public void Show(String title){
         this.setTitle(title);
         this.setVisible(true);
  }
  public void Show(String title,int width, int height) {
      this.setTitle(title);
      this.setSize(width, height);
      this.setVisible(true);
  }
  public void Show(int width,int height,int a,int b){
      this.setSize(width, height);
      this.setLocation(a,b);
      this.setVisible(true);
  }
  public void BoomWindows(){
      Random rd = new Random() ;
//      int n = rd.nextInt(2,20) ;
      int a,b ,width,height  ;
           a = rd.nextInt(100,300) ;
           b =  rd.nextInt(100,300) ;
           width = rd.nextInt(300,1000) ;
           height = rd.nextInt(300, 1000) ;
           Show(width,height,a,b) ;
  }
    public static void main(String[] args) {
        MyWindows az[] =new MyWindows[10] ;
        MyWindows a2 =new MyWindows() ;
        MyWindows a3 =new MyWindows() ;
        Random rd = new Random() ;
//      int n = rd.nextInt(2,20) ;
        int a,b ,width,height  ;
        for(int i=0;i<3;i++){
        a = rd.nextInt(100,300) ;
        b =  rd.nextInt(100,300) ;
        width = rd.nextInt(300,1000) ;
        height = rd.nextInt(300, 1000) ;
            a3.Show(width,height,a,b);
            System.out.println("XIn chao ") ;
    }
  }
}
