package com.main.composition;

public class Book {
    private String Name;
    private String Author;

    Book(String author, String name){
        setAuthor(author);
        setName(name);
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

    public void getThisBook(){
        System.out.println("\n Name: " + getName());
        System.out.println(" Author: " + getAuthor() + "\n");
    }
}
