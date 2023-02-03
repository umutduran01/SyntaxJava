package class17.Class17Homework;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
    */

    String author;
    int pageNumber;
    int year;

    Book(String bAuthor, int bPageNumber) {
        author = bAuthor;
        pageNumber = bPageNumber;
    }

    Book(int bPageNumber, int bYear){
        pageNumber = bPageNumber;
        year = bYear;
    }

    public static void main(String[] args) {

        Book newBook = new Book("Paulo Coelho", 354);
        Book newBook2 = new Book(467,1997);

    }
}
