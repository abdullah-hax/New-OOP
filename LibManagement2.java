package practiseJava.previousbatch;

import java.util.ArrayList;


class Book {
    private String bookID;
    private String title;
    private String author;
    private int availableCopies;

    public Book(String bookID, String title, String author, int availableCopies) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook() throws BookNotAvailableException {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            throw new BookNotAvailableException("Book not available: " + title);
        }
    }

    public void returnBook() {
        availableCopies++;
    }

    public void display() {
        System.out.println(bookID + " | " + title + " | " + author + " | Copies: " + availableCopies);
    }
}


class Library {
    private ArrayList<Book> books;  // ArrayList<Book> = Book typer object রাখার জন্য একটা list, books = variable ortat oi list er nam 

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        for (Book b : books) {
            if (b.getAvailableCopies() > 0) {
                b.display();
            }
        }
    }
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}


public class LibManagement2 {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("B101", "Java Basics", "James Gosling", 2);
        Book b2 = new Book("B102", "Data Structures", "Mark Weiss", 1);

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("Available books:");
        library.displayAvailableBooks();

        try {
            System.out.println("\nBorrowing Java Basics...");
            b1.borrowBook();
            b1.borrowBook();
            b1.borrowBook(); // this will throw exception
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nReturning Java Basics...");
        b1.returnBook();

        System.out.println("\nSearch result:");
        Book found = library.searchBookByTitle("Java Basics");
        if (found != null) {
            found.display();
        }
    }
}


// ArrayList<Book> = Book typer object রাখার জন্য একটা list, books = variable ortat oi list er nam 
// String bookId = String typer ekta cell jei celler nam bookID (bujar subidarte string = 1 cell dhorlam)
// ArrayList<Book> books = Book typer object rakar jnno ekta list(koekta cell) , jei list er nam books


/*  */


// package newOOP;

// class Book{
//     private String bookID;
//     private String title;
//     private String author;
//     private int availableCopies;

//     public Book(String bookID, String title, String author, int availableCopies){
//         this.bookID = bookID;
//         this.title = title;
//         this.author = author;
//         this.availableCopies = availableCopies;
//     }

//     public String getTitle(){
//         return title;
//     }

//     public int getAvailableCopies(){
//         return availableCopies;
//     }

//     public void borrowBook(){
//         if (availableCopies > 0){
//             availableCopies--;
//         } else {
//             throw new IllegalArgumentException("Book not available: ");
//         }
//     }

//     public void returnBook(){
//         availableCopies++;
//     }

//     public void display(){
//         System.out.println(bookID + " | " + title + " | " + author + " | " + "Copies: " + availableCopies);
//     }

// }

// class Library{
//     private ArrayList<Book> books;

//     public Library(){
//         books = new ArrayList<>();
//     }
// }

// public class practise {
    
// }
