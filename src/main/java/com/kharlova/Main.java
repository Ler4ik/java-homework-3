package com.kharlova;

public class Main {

    public static void main(String[] args) {

        int readingSpeed = 10;
        Book book = new Book("Head first Java", "Kathy Sierra and Bert Bates",720, true);
        Book newBook = new Book ("Thinking in Java", "Bruce Eckel",1168, true);

        System.out.println("Для прочтения книги " + book.title + " Вам понадобится " + book.dayOfReading(readingSpeed, book.pageCount) + " дней" );
        System.out.println("Для прочтения книги " + newBook.title + " Вам понадобится " + newBook.dayOfReading(readingSpeed, newBook.pageCount) + " дней" );

    }
}
