package ArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class BookList {
    private ArrayList<Book>BookList ;

    public BookList() {
        this.BookList = new ArrayList<Book>() ;
    }
    public void AddBooks(Book book){
        this.BookList.add(book) ;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "BookList=" + BookList +
                '}';
    }
    public void DisplayList(){
        for(Book a :BookList){
            System.out.println(a.toString());
        }
    }
    public boolean SearchBook(Book book){
        return this.BookList.contains(book) ;
    }
    public void UpdatePrice(Book book){
        int flag = 0  ;
        for(Book a: BookList){
            if(SearchBook(a)) {
                flag =  1 ;
                System.out.println("Enter new price for book: ");
                Scanner sc = new Scanner(System.in) ;
                double price = sc.nextDouble() ;
                a.setPrice(price);
                return ;
            }
        }
        if(flag == 0) System.out.println("Not found book! ");
    }
    public void Sort(){
        Collections.sort(BookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1,Book o2) {
                if(o1.getCode().equalsIgnoreCase(o2.getCode())) return 1 ;
                else return -1 ;
            }
        });
    }
    public boolean removeBook(Book book){
        for(Book a:BookList){
            if(a.compareTo(book) == 0 ) {
                 this.BookList.remove(a);
                 return true ;
            }
        }
        return false ;
    }
    public double maxPrice(){
        double max = -1 ;
        for(Book a : BookList )
    {
          if(a.getPrice() > max)
               max = a.getPrice() ;
    }
        return max ;
    }
    public void LoadDateFormFile(File file){
        try{
            OutputStream os = new FileOutputStream(file) ;
            ObjectOutputStream oos = new ObjectOutputStream(os) ;
            for(Book a: BookList){
                oos.writeObject(a);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
