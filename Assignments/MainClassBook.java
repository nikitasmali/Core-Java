package com.demo.Classassignments;

import java.util.ArrayList;

public class MainClassBook{
    public static void main(String[] args)
    {
        Library library = new Library();

        library.addBook(new Book(1, "Book1", "Author1"));
        library.addBook(new Book(2, "Book2", "Author2"));
        library.addBook(new Book(3, "Book3", "Author1"));
        library.addBook(new Book(4, "Book4", "Author3"));

        ArrayList<Book> allBooks = library.viewAllBooks();
        System.out.println("All Books in the Library:");
        for (Book book : allBooks)
        {
            System.out.println("ISBN: " + book.getIsbnno() + ", Title: " + book.getBookName() + ", Author: " + book.getAuthorName());
        }

        String authorToSearch = "Author1";
        ArrayList<Book> booksByAuthor = library.viewBooksByAuthor(authorToSearch);
        System.out.println("\nBooks by Author " + authorToSearch + ":");
        for (Book book : booksByAuthor)
        {
            System.out.println("ISBN: " + book.getIsbnno() + ", Title: " + book.getBookName() + ", Author: " + book.getAuthorName());
        }

        String bookNameToCount = "Book1";
        int bookCount = library.countBooks(bookNameToCount);
        System.out.println("\nNumber of books with title " + bookNameToCount + ": " + bookCount);
    }
}
