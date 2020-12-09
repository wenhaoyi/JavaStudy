package com.company;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {
    public static void main(String[] args){
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1,15));
        studs.add(new Student(2,25));
        studs.add(new Student(3,35));
        studs.add(new Student(4,45));
        studs.add(new Student(5,55));
        studs.add(new Student(5,65));
        for (Student s:studs){
            System.out.println(s);
        }
    }

}

class Student{
    int rollno;
    int marks;
    public Student(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
