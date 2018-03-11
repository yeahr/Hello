package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import domain.Person;
import domain.Student;
import domain.Worker;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<String> d = new Demo<String>();
		d.show("haha");
		d.genericShow(7);
		Demo.staticShow(7.8);

		SubImplIter sub = new SubImplIter();
		sub.show("demo");

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("one",20));
		list.add(new Student("two",21));
		list.add(new Student("three",22));
		printCollection(list);
		
		Set<Worker> set = new HashSet<Worker>();
//		Worker w = new Worker("worker3",33);
//		System.out.println(w.hashCode());

		set.add(new Worker("worker1",31));
		set.add(new Worker("worker2",32));
		set.add(new Worker("worker3",33));
		
		printCollection(set);
	}

	private static void printCollection(Collection<? extends Person> coll) {
		for (Iterator<? extends Person> it = coll.iterator(); it.hasNext();) {
			Person p = it.next();
			System.out.println(p);
		}
	}
}

class Demo<W> {

	public void show(W w) {
		System.out.println("show:" + w);
	}

	public static <O> void staticShow(O o) {
		System.out.println("staticShow:" + o);
	}

	public <R> void genericShow(R r) {
		System.out.println("genericShow:" + r);
	}
}

interface Inter<T> {
	public void show(T t);
}

class ImplIter<W> implements Inter<W> {

	@Override
	public void show(W t) {
		// TODO Auto-generated method stub
		System.out.println("show:" + t);
	}

}

class SubImplIter extends ImplIter<String> {

}