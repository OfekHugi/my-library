package com.example.mylibrary;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pages;
    private String imageUrl;
    private String shortDest;
    private String longDesc;

    private boolean isExpended;

    public Book(int id, String name, String author, int pages, String imageUrl, String shortDest, String longDesc) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.imageUrl = imageUrl;
        this.shortDest = shortDest;
        this.longDesc = longDesc;
        isExpended = false;
    }

    public boolean isExpended() {
        return isExpended;
    }

    public void setExpended(boolean expended) {
        isExpended = expended;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShortDest() {
        return shortDest;
    }

    public void setShortDest(String shortDest) {
        this.shortDest = shortDest;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", imageUrl='" + imageUrl + '\'' +
                ", shortDest='" + shortDest + '\'' +
                ", longDesc='" + longDesc + '\'' +
                '}';
    }
}
