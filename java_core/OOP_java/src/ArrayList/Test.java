package ArrayList;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int choice = 0  ;
                BookList bl = new BookList() ;
                do{
                    System.out.println("Menu: ");
                    System.out.println("1. Input a books. \n"
                            + "2.  Display all books. \n"
                            + "3.  Search a book for given code. \n"
                            + "4.  Update the book's price for given code. \n"
                            + "5.  Find the max price value. \n"
                            + "6.  Sort the list ascendingly by code. \n"
                            + "7.  Remove the book having given code. \n"
                            + "8.  Load data from file. \n"
                            + "0. Exit!\n ") ;
                    System.out.println("Choose function, please ");
                    choice = sc.nextInt() ;
                    sc.nextLine();
                    if(choice == 1){
                        System.out.println("Enter book title: ");
                        String title = sc.nextLine() ;
                        System.out.println("Enter book code: ");
                        String code = sc.nextLine() ;
                        System.out.println("Enter book qua: ");
                        int qua = sc.nextInt() ;
                        System.out.println("Enter pirce: ");
                        double price = sc.nextDouble() ;
                        Book book = new Book(code,title,qua,price) ;
                        bl.AddBooks(book);
                    }
                    if (choice == 2){
                        bl.DisplayList();
                    }
                    if (choice == 3){
                        System.out.println("Enter the code to search : ");
                        String code = sc.nextLine();
                        Book book = new Book(code) ;
                        System.out.println("Find it:"+ bl.SearchBook(book));
                    }
                    if (choice == 4){
                        System.out.println("Enter the code : ");
                        String code = sc.nextLine();
                        Book book = new Book(code) ;
                        bl.UpdatePrice(book);
                    }if (choice == 5){
                        System.out.println("Max price: "+ bl.maxPrice());
                    }if (choice == 6){
                        bl.Sort();
                          bl.DisplayList();
                    }if (choice == 7){
                        System.out.println("Enter the code : ");
                        String code = sc.nextLine();
                        Book book = new Book(code) ;
                        System.out.println("Removed: "+bl.removeBook(book)) ;
                    }if (choice == 8){
                        System.out.println("Enter path file name: ");
                        String nameFile = sc.nextLine() ;
                        File file = new File(nameFile);
                        bl.LoadDateFormFile(file);
                    }
                }while(choice != 0) ;
    }
}
