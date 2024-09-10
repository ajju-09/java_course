import java.sql.SQLOutput;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println(books+" has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are :");
        for(String books : this.books){
            if(books == null){
                continue;
            }
            System.out.println(books);
        }
    }
    void issuedBook(String book){
        for (int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist ");
    }
    void returnBook(String book){
        addBooks(book);
    }
}
public class exercise4 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library lib = new Library();
        lib.addBooks("Computer organization & Architecture");
        lib.addBooks("OOPS");
        lib.addBooks("Operating System");
        System.out.println();
        lib.showAvailableBooks();
        lib.issuedBook("Operating System");
        System.out.println();
        lib.showAvailableBooks();
        lib.returnBook("Operating System");
        System.out.println();
        lib.showAvailableBooks();
    }

}
