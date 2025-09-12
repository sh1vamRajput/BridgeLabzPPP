package OOPS.constructor;
class LibraryBook {
    String title, author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println(title + " by " + author + " | Price: " + price + " | Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Effective Java", "Joshua Bloch", 550.0);
        b.display();
        b.borrowBook();
        b.display();
    }
}

