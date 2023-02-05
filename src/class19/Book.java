package class19;

public class Book {

    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
    */

    String title;
    String author;
    int year;

    Book(String title, int year){
        this.title = title;
        this.year = year;
    }

    Book(String author, String title, int year){
        this(title,year);
        this.author = author;
    }

    void info(){
        System.out.println(title + " " + author + " " + year);
    }

    public static void main(String[] args) {
        Book newTest = new Book("ali top oynuyor","veli deli",2019);
        newTest.info();
    }
}
