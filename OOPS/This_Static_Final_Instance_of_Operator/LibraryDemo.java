package OOPS.This_Static_Final_Instance_of_Operator;

// Library Management System demonstrating static, this, final, and instanceof
class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe", "978-11111");
        if (b1 instanceof Book) {
            Book.displayLibraryName();
            b1.displayDetails();
        }
    }
}
