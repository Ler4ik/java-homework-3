package com.kharlova;

public class Book {
    String title;
    String author;
    int pageCount;
    boolean hardCover;

    public Book(String title, String author, int pageCount, boolean hardCover) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.hardCover = hardCover;
    }

    int dayOfReading(int readingSpeed, int pageCount){
        return pageCount/readingSpeed;
    }


}
