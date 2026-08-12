package com.hanqi.javase.chapter08_oop.test;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie() {
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("评分不合法");
        }
    }

    public void showInfo() {
        System.out.println("电影名称：" + title);
        System.out.println("导演：" + director);
        System.out.println("评分：" + rating);
    }
}
