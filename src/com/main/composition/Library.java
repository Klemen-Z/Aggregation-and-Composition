package com.main.composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Library {
    private int bookCount;
    private String name;

    HashMap<Integer, Book> books = new HashMap<>();
    ArrayList<String> bookNames = new ArrayList<>();
    ArrayList<String> author = new ArrayList<>();

    Library(String name){
        setName(name);
        fillBooks();
    }

    public void fillBooks(){
        Random r = new Random();
        bookNames.add("Hunger Games");
        bookNames.add("Catching Fire");
        bookNames.add("Mockingjay");
        bookNames.add("1984");
        author.add("Suzanne Collins");
        author.add("Suzanne Collins");
        author.add("Suzanne Collins");
        author.add("George Orwell");
        int i = 0;
        for (String name : this.bookNames) {
            String auth = this.author.get(i);
            books.put(i, new Book(auth, name));
            i++;
        }
        setBookCount(books.size());
    }

    public String getName() {
        return name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void getLibrary(){
        System.out.println("\n Name: " + getName());
        System.out.println(" Amount of Books available: " + getBookCount() + "\n");
    }

    public void getLibraryBooks(){
        System.out.println(" Books available: ");
        for (Book book : this.books.values()) {
            book.getThisBook();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookCount(int book_count) {
        this.bookCount = book_count;
    }
}
