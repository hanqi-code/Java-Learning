package com.hanqi.javase.chapter11_inheritance.biglab.courseplatform;

public class CoursePlatformLab {
    public static void main(String[] args) {
        StudentUser student = new StudentUser("001", "Alice", UserStatus.ACTIVE, "Grade 10");
        student.showInfo();
        student.login();
        student.study();
        System.out.println();

        TeacherUser teacher = new TeacherUser("002", "Bob", UserStatus.ACTIVE, "Java");
        teacher.showInfo();
        teacher.login();
        teacher.teach();
    }
}
