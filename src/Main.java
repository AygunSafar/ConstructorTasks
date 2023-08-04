import bank.BankAccount;
import bookDetails.Book;
import vehicles.Car;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {


        Book book= new Book("Green Mile","Stephen King",1996,500);
        book.updateBookDetails();
        System.out.println(book);


        Vehicle v= new Car("Mercedes",2006,4);
        v.displayDetails();

        BankAccount bankAccount=new BankAccount("1232","Test");
        bankAccount.depositMoney(45);
        bankAccount.withdrawMoney(500);
        System.out.println(bankAccount);



    }
}