package Homework.Homework1;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
        }

    }

    public void returnBook() {
        if (!this.isAvailable) {
            this.isAvailable = true;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println(" - Book - "
                + "\nTitle: " + this.title
                + "\nAuthor: " + this.author
                + "\nYear: " + this.year
                + "\nAvailable: " + this.isAvailable);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
