package org.georgiancollege.week02;

import java.util.Arrays;
import java.util.List;

// this is our model class
public class Book {
    // variables and constants
    private int bookId;
    private String bookName, author, genre;
    private double price;
    private boolean isAvailable;

    // constructor
    public Book(int bookId, String bookName, String author, String genre, double price, boolean isAvailable) {
        setBookId(bookId);
        setBookName(bookName);
        setAuthor(author);
        setGenre(genre);
        setPrice(price);
        setAvailable(isAvailable);
    }

    // methods - getters, setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        if(bookId <= 0){
            throw new IllegalArgumentException("Book ID cannot be negative");
        } else {
            this.bookId = bookId;
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName.isBlank()){
            throw new IllegalArgumentException("Book Name cannot be empty.");
        } else {
            this.bookName = bookName;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.isBlank()){
            throw new IllegalArgumentException("Author cannot be empty.");
        } else {
            this.author = author;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        List<String> validGenres = Arrays.asList("Comedy", "Crime", "Fantasy", "Fiction", "Thriller", "Horror");
        if(validGenres.contains(genre)){
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre should be from the list: " + validGenres);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // to string method

    @Override
    public String toString() {
        return String.format("%d: The price of %s written by %s of %s " +
                        "is %f. Availability: %s",
                bookId, bookName, author, genre, price, isAvailable);
    }
}
