package Homework.Homework1;

public class Main {
    public static void main(String[] args) {
        //=== Add Book in list Boks ===
        Library.addBook(new Book("The Little Prince", "Antoine de Saint-Exupery"));
        Library.addBook(new Book("And Then There Were None", "Agatha Christie", 1939, true));
        Library.addBook(new Book("Murder on the Orient Express", "Agatha Christie", 1934, false));
        Library.addBook(new Book("Death on the Nile", "Agatha Christie", 1937, true));
        Library.addBook(new Book("The Murder of Roger Ackroyd", "Agatha Christie", 1926, false));
        Library.addBook(new Book("The Mysterious Affair at Styles", "Agatha Christie", 1920, true));
        Library.addBook(new Book("The Mysterious Affair at Styles", "Agatha Christie", 1920, true));

        System.out.println("\n=== Output all isAlailable books ===\n");
        Library.printAvailableBooks();

        System.out.println("\n=== Find and output books by author ===\n");
        Library.findBooksByAuthor("Agatha Christie")
                .forEach(book -> book.displayInfo());
        //Replace asAvailable

        Library.findBookByTitle("The Mysterious Affair at Styles")
                .ifPresentOrElse(element -> {
                            System.out.println("Replace book");
                            element.displayInfo();
                            element.borrowBook();
                        },
                        () -> System.out.println("\n Book not found"));


        System.out.println("\n=== Output all isAlailable books ===\n");
        Library.printAvailableBooks();

    }
}
