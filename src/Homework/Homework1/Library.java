package Homework.Homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private static List<Book> books = new ArrayList<Book>();
    static {
            books.add(new Book("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 2015, true));
            books.add(new Book("Charlie and the Chocolate Factory","Roald Dahl"));
            books.add(new Book("The Tale of Peter Rabbit", "Beatrix Potter",2012,false));
            books.add(new Book("The Perks of Being a Wallflower", "Stephen Chbosky",2000,false));
            books.add(new Book("The Perks of Being a Wallflower 2", "Stephen Chbosky"));
            books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
            books.add(new Book("1984", "George Orwell", 1949, false));
            books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, true));
            books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, false));
            books.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
            books.add(new Book("And Then There Were None", "Agatha Christie", 1939, false));
            books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true));
            books.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967, true));
    }
    public static void addBook(Book book) {
        books.add(book);
    }
    public static void printAvailableBooks (){
        books.stream()
                .filter(book -> book.isAvailable())
                .forEach(book -> book.dislpayInfo());
    }
    public static List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public static Book findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst().orElse(null);
    }
}
