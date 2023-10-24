package com.demo.Classassignments;

public class Book
{
    private int isbnno;
    private String bookName;
    private String authorName;

    public Book(int isbnno, String bookName, String authorName) {
        this.isbnno = isbnno;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getIsbnno() {
        return isbnno;
    }

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
