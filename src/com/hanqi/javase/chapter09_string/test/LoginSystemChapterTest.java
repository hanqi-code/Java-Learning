package com.hanqi.javase.chapter09_string.test;

import java.util.Scanner;

public class LoginSystemChapterTest {
    public static void main(String[] args) {
        //准备系统里保存的账号密码：
        String correctUsername = "hanqi2026";
        String correctPassword = "Java123";

        String loginStatus = "登录失败";

        //模拟用户输入：
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputUsername = scanner.nextLine().trim();
        System.out.println("请输入密码：");
        String inputPassword = scanner.nextLine().trim();



        //判断用户名长度,密码长度是否至少 6 个字符。
        if ((inputUsername.length() >= 6) && (inputPassword.length() >= 6)) {
            //判断密码里面是否包含 "Java"
            System.out.println(inputPassword.contains("Java"));
            //使用 equals() 判断用户名 密码是否正确
            if (correctUsername.equals(inputUsername) && correctPassword.equals(inputPassword)) {
                loginStatus = "登录成功";
            } else {
                System.out.println("用户名或密码错误");
            }
        } else {
            System.out.println("用户名或密码长度不符合要求");
        }

        String email = "hanqi2026@gmail.com";
        int index = email.indexOf("@");
        String userName = email.substring(0, index);
        System.out.println(userName);
        String userEmail = email.substring(index + 1);
        System.out.println(userEmail);

        StringBuilder sb = new StringBuilder();
        sb.append("用户名：");
        sb.append(userName);
        sb.append("\n邮箱域名：");
        sb.append(userEmail);
        sb.append("\n登录状态：");
        sb.append(loginStatus);
        System.out.println(sb.toString());

    }
}
