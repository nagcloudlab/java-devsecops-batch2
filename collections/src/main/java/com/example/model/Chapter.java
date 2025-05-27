package com.example.model;

public class Chapter implements Comparable<Chapter> {

    private String title;
    private int pageNumber;

    @Override
    public int compareTo(Chapter o) {
        return this.title.compareTo(o.title);
    }

    public Chapter(String title, int pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }

}
