package com.hanqi.javase.chapter11_inheritance.lab.javabean;

public class PersonInheritanceLab {
    public static void main(String[] args) {
        //学生
        System.out.println("Undergraduate Student:");
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Tom", 18, "Junior");
        System.out.println(undergraduateStudent.getName() + " " + undergraduateStudent.getAge() + " " + undergraduateStudent.getGrade());
        undergraduateStudent.study();
        System.out.println();
        System.out.println("Graduate Student:");
        GraduateStudent graduateStudent = new GraduateStudent("Jerry", 22, "Grade 3");
        System.out.println(graduateStudent.getName() + " " + graduateStudent.getAge() + " " + graduateStudent.getGrade());
        graduateStudent.study();
        System.out.println();

        //研究生宿舍升级
        graduateStudent.sleep();
        System.out.println();

        //教师
        System.out.println("MajorCourse Teacher:");
        MajorCourseTeacher majorCourseTeacher = new MajorCourseTeacher("Mike", 30, "Mathematics");
        System.out.println(majorCourseTeacher.getName() + " " + majorCourseTeacher.getAge() + " " + majorCourseTeacher.getSubject());
        majorCourseTeacher.teach();
        System.out.println();
        System.out.println("General Course Teacher:");

        GeneralCourseTeacher generalCourseTeacher = new GeneralCourseTeacher("Emily", 25);
        System.out.println(generalCourseTeacher.getName() + " " + generalCourseTeacher.getAge());
        generalCourseTeacher.teach();
    }
}
