package test;

public class sample2 {

	public static void main(String[] args) {

		Person p = new Person();
 
		p.name = "최명헌";
		p.age = 20;
		
		System.out.println(p.name);
		System.out.println(p.age);
        Student s = new Student();
        s.학번 = "1234";
        s.학번 = "소프트웨어 학과";
 
	}

}


class Person{
	
	String name;
	int age;
}
class Student{
	String 학번 ;
	String 학과 ;
}