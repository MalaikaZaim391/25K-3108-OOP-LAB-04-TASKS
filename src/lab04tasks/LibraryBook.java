package lab04tasks;

public class LibraryBook {
    //data members
    String bookTitle;
    double price;

    //constructor for no data - default
    LibraryBook(){
        this.bookTitle = "Unknown";
        this.price = 0.00;
    }

    //constructor if title only, no price
    LibraryBook(String title){
        this.bookTitle = title;
        this.price = 500;
    }

    //constructor if both price and title provided
    LibraryBook(String title, double PRICE){
        this.bookTitle = title;
        this.price = PRICE;
    }

    void display(){
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: $" + price);
        System.out.println("-------------------\n");
    }

    public static void main(String[] args){

        //no data
        System.out.println("NO DATA CONSTRUCTOR");
        LibraryBook b1 = new LibraryBook();
        b1.display();

        //title only
        System.out.println("TITLE ONLY CONSTRUCTOR");
        LibraryBook b2 = new LibraryBook("Harry Potter and the Prisoner of Azkaban");
        b2.display();

        //both title and price
        System.out.println("TITLE + PRICE CONSTRUCTOR");
        LibraryBook b3 = new LibraryBook("Harry Potter and the Prisoner of Azkaban", 250.25);
        b3.display();

    }


}
