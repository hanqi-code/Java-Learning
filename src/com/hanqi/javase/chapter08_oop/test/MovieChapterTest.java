package com.hanqi.javase.chapter08_oop.test;

public class MovieChapterTest {
    public static void main(String[] args) {
        Movie[] mov = new Movie[4];
        mov[0] = new Movie("The Shawshank Redemption", "Frank Darabont", 9.3);
        mov[1] = new Movie("Inception", "Christopher Nolan", 8.8);
        mov[2] = new Movie("Interstellar", "Christopher Nolan", 8.7);
        mov[3] = new Movie("Forrest Gump", "Robert Zemeckis", 8.8);

        //输出所有电影
        for (int i = 0; i < mov.length; i++) {
            mov[i].showInfo();
            System.out.println();
        }

        //计算平均评分
        double sum = 0;
        for (int i = 0; i < mov.length; i++) {
            sum += mov[i].getRating();
        }
        double average = sum / mov.length;
        System.out.printf("平均评分：%.2f%n",average);
        System.out.println();

        //找出评分最高的 Movie 对象
        Movie maxMovie = mov[0];
        for (int i = 1; i < mov.length; i++) {
            if (maxMovie.getRating() < mov[i].getRating()) {
                maxMovie = mov[i];
            }
        }
        System.out.println("评分最高的电影：");
        maxMovie.showInfo();
        System.out.println();

        //统计评分高于平均分的电影数量
        int count = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].getRating() > average) {
                count++;
            }
        }
        System.out.println("评分高于平均分的电影数量：" + count);
        System.out.println();

        //根据电影名查找 "Interstellar"把评分改成 9.0
        String target = "Interstellar";
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].getTitle().equals(target)) {
                mov[i].setRating(9.0);
                mov[i].showInfo();
                break;
            }
        }

    }
}
