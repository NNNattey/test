package com.atnattey.pta;


class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void work(){
        
    }
    void show() {
        System.out.print(name+" "+age+" ");
    }
}

/* 请在这里填写答案 */

class Teacher extends Person{
	private String college;	
	
	Teacher(String name, int age,String college) {
		super(name, age);
		this.college = college;
		// TODO Auto-generated constructor stub
	}
	public void show(){
		System.out.println(name+" "+age+" "+college);
	}
	public void work() {
		System.out.println("教师的工作是教学。");
	}
}

public class TeacherTest {

    public static void main(String[] args) {
    
         Teacher t = new Teacher("Li",40,"信工院");
         t.show();
         t.work();
    }
}

