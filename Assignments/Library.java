package com.demo.Classassignments;

import java.util.ArrayList;

public class Library 
{
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void addBook(Book bobj) 
    {
        bookList.add(bobj);
    }

    public boolean isEmpty()
    {
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() 
    {
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author)
    {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList)
        {
            if (book.getAuthorName().equalsIgnoreCase(author))
            {
                booksByAuthor.add(book);
            }
        }
        if (booksByAuthor.isEmpty()) 
        {
            System.out.println("The list is empty.");
        }
        return booksByAuthor;
    }
    public int countBooks(String bname)
    {
        int count = 0;
        for (Book book : bookList) 
        {
            if (book.getBookName().equalsIgnoreCase(bname)) 
            {
                count++;
            }
        }
        return count;
    }
}
