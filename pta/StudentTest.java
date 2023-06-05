package com.atnattey.pta;

import java.util.Scanner;
class Student {
     int id;
     String name;
     int age;
     public Student(int id,     String name,     int age) {
         this.id = id;
         this.name = name;
         this.age = age;
     }
     
     /* 请在这里填写答案 */
     public boolean equals(Student student) {
		if(this.id==student.id) return true;
		else return false;
	}
         
}
public class StudentTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.println(s1.equals(s2));
        sc.close();
    }
}

