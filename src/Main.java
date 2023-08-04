import bookDetails.Book;

public class Main {
    public static void main(String[] args) {

        Book book= new Book("Green Mile","Stephen King",1996,500);
        book.updateBookDetails();
        System.out.println(book);

    }
}