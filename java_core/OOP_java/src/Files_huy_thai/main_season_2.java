package Files_huy_thai;

import java.io.BufferedReader;
import java.io.FileReader;

public class main_season_2 {
    private int line;
    private int column;
    private int[][] maTran;

    void main_season_2() {
        this.line = 0;
        this.column = 0;
        this.maTran = new int[10][10];
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMaTran(int[][] maTran) {
        this.maTran = maTran;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getMaTran() {
        return maTran;
    }

    public void hienThiMT() {
        int[][] matran = getMaTran();
        for(int i = 0; i < getLine(); i++) {
            for(int j = 0; j < getColumn(); i++) {
                System.out.printf(" %d ", matran[i][j]);
            }
            System.out.println();
        }
    }

    public void readFromFile(String fileName, int[][] matran) {

        // int n = 0, m = 0;
        // int[][] matran = new int[n][m];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String hangCot = "";
            String giaTri = "";
            hangCot = br.readLine();
            String[] hc = hangCot.split("\\s+");
            setLine(Integer.parseInt(hc[0]));
            setColumn(Integer.parseInt(hc[1]));
            // this.line = Integer.parseInt(hc[0]);
            // this.column = Integer.parseInt(hc[1]);
            int i = 0;
            while(true) {
                giaTri = br.readLine();
                if(giaTri == null) {
                    break;
                }
                String[] gt = giaTri.split("\\s+");

                for(int j = 0; j < getColumn(); j++) {

                    matran[i][j] = Integer.parseInt(gt[j]);

                }
                i++;
            }
            setMaTran(matran);
            br.close();
            fr.close();
        }
        catch (Exception e) {
            // TODO: handle exception

        }

        // for(int i = 0; i < getLine(); i++) {
        //     for(int j = 0; j < getColumn(); j++) {
        //         System.out.printf(" %d ", matran[i][j]);
        //     }
        //     System.out.println();
        // }
        // return matran;
    }
}
