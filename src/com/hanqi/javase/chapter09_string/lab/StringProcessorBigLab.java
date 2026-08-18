package com.hanqi.javase.chapter09_string.lab;

public class StringProcessorBigLab {
    public static void main(String[] args) {
        String text = "   Java is fun, I like Java and Minecraft.   ";

        //删除首尾空格
        String cleanText=text.trim();

        //输出 cleanText 的长度。
        System.out.println(cleanText.length());

        //判断是否包含 "Minecraft"。
        System.out.println(cleanText.contains("Minecraft"));

        //判断是否以 "Java" 开头。
        System.out.println(cleanText.startsWith("Java"));

        //判断是不是以 "." 结尾。
        System.out.println(cleanText.endsWith("."));

        //找出第一个 "Java" 的位置。
        int first=cleanText.indexOf("Java");
        System.out.println(first);

        //找出第二个 "Java" 的位置。
        System.out.println(cleanText.indexOf("Java",first+1));

        //把所有 "Java" 替换成 "Python"
        String newText=cleanText.replace("Java","Python");
        System.out.println(newText);

        //输出 newText 的全大写形式。
        System.out.println(newText.toUpperCase());

        //统计字符 'a' 一共出现多少次
        int count=0;
        for (int i = 0; i < cleanText.length(); i++) {
            if (cleanText.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

        //创建 StringBuilder，依次 append()
        StringBuilder sb = new StringBuilder();
        sb.append("原文本：");
        sb.append(cleanText);
        sb.append("\n修改后：");
        sb.append(newText);
        System.out.println(sb.toString());
    }
}
