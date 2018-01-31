package com.cet.jab.mca;

/**
 * Created by mcaguest on 30/1/18.
 */
//class for data items
public class Book {

    private int id;
    private String title;
    private String author;

    public Book(){}

    public Book(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }
    //getters & setters
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author
                + "]";
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setId(int id){ this.id=id; }
    public int getId(){ return id;}
}