package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
         String s = "Book [ " + name + " ]\n";
         for (Book list : books){
             s = s + list.toString() + "\n";
         }
         return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book list : books){
            Book clonedList = new Book(list.getTitle(), list.getAuthor(), list.getPublicationDate());
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return name.equals(library.name) && books.equals(library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}