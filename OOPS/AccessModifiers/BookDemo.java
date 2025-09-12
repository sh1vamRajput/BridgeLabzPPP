package OOPS.AccessModifiers;
// Demonstration of Access Modifiers with Book and EBook classes

class Book {
    public String ISBN;         // Public: Accessible everywhere
    protected String title;     // Protected: Accessible in same package & subclasses
    private String author;      // Private: Accessible only within this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to set and get author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass to demonstrate access to ISBN and title
class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showDetails() {
        // Accessing public and protected members
        System.out.println("E-Book ISBN: " + ISBN);
        System.out.println("E-Book Title: " + title);
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-12345", "Java Programming", "John Doe");
        ebook.showDetails();
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
