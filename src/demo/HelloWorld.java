package demo;

import domain.Student;
import domain.Worker;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util<Student> util = new Util<Student>();
		util.setObj(new Student());
		System.out.println(util.getObj());
		util.setObj(new Student("Mary",20));
		System.out.println(util.getObj());
		
		Util<Worker> ut = new Util<Worker>();
		ut.setObj(new Worker("Mike",30));
		System.out.println(ut.getObj());
		System.out.println("\n");

		System.out.println("test git commit and push");
		System.out.println("first Egit task finished!");
				
	}

}
class Util<O>{
	private O obj;

	public O getObj() {
		return obj;
	}

	public void setObj(O obj) {
		this.obj = obj;
	}
	
}
class Tool{
	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}