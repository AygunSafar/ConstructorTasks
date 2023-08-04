package bookDetails;

import java.io.PrintStream;
import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private int pageCount;

    public Book() {
        this.title = "Unknown" ;
        this.author = "Unknown" ;
        this.yearPublished = 0;
        this.pageCount = 0;
    }

    public Book(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public void updateBookDetails(){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Update user select option:" +
                    "1.Update Title \n" +
                    "2.Update Author \n" +
                    "3.Update Pulish Year \n" +
                    "4.Update Page Count \n" +
                    "5.Cancel"
            );
            int option=sc.nextInt();
            sc=new Scanner(System.in);
            if(option==1){
                System.out.println("Add new title:");
                this.title=sc.nextLine();
            }
            else if(option==2){
                System.out.println("Add new Author:");
                this.author=sc.nextLine();
            }
            else if(option==3){
                System.out.println("Add new Year:");
                this.yearPublished=sc.nextInt();
            }
            else if(option==4){
                System.out.println("Add new Count:");
                this.pageCount=sc.nextInt();
            }
            else if(option==5){
                break;
            }
            else{
                System.out.println("Invalid Option");
            }
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", pageCount=" + pageCount +
                '}';
    }
}
