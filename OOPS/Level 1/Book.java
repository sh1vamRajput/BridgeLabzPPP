class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 499.99);
        b1.displayDetails();
    }
}