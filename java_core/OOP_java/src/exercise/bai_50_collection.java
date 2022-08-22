package exercise;

import java.util.ArrayList;

public class bai_50_collection {
    ArrayList<bai_50_Cricle>CC = new ArrayList<bai_50_Cricle>() ;
    public void addCricle(bai_50_Cricle cc){
        CC.add(cc)   ;
    }
    public int  getSize(){
        return CC.size();
    }

    public bai_50_collection(ArrayList<bai_50_Cricle> CC) {
        this.CC = CC;
    }
    public ArrayList<bai_50_Cricle> getCC() {
        return CC;
    }

    public void setCC(ArrayList<bai_50_Cricle> CC) {
        this.CC = CC;
    }

    public bai_50_collection() {
        bai_50_Cricle bc = new bai_50_Cricle() ;
    }

    @Override
    public String toString() {
        return "bai_50_collection{" +
                "CC=" + CC.toString() +
                '}';
    }
    public void Infor(){
        for (bai_50_Cricle sd: CC
             ) {
            System.out.println( sd.toString()) ;
        }
    }
    public double Sum(){
        double sum = 0  ;
        for (bai_50_Cricle bt : CC
             ) {
            sum+=bt.getArea() ;
        }
        return sum ;
    }
    public double findMaxArea(){
        double Max =    0 ;
        for (bai_50_Cricle bt : CC
             ) {
            if(bt.getArea() > Max) Max = bt.getArea() ;
        }
        return Max ;
    }
    public void showOne(bai_50_Cricle bc){
        bc.toString();
    }
    public bai_50_Cricle getMinCricle(){
        double min = findMaxArea() ;
        bai_50_Cricle ag = new bai_50_Cricle();
        for (bai_50_Cricle bt : CC
             ) {
            if(bt.getArea() < min ) {
                min = bt.getArea()  ;
                ag.setR(bt.getR());  ;
            }
        }
        return  ag  ;
    }
}
