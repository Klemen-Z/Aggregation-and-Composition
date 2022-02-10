package com.main.composition;

public class Building {
    public static void main(String[] args) {
        Library library = new Library("INSERT_PLACE_NAME Library");
        library.getLibrary();
        library.getLibraryBooks();
    }
}
