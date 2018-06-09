package com.apptrics.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Basic3 {

	public static void main(String[] args) {

		List<Person> lp = Arrays.asList(

				new Person("Ram", "perusomala", 25), new Person("Sudhir", "Manepalli", 25),
				new Person("Prathap", "Thota", 27), new Person("Yaswanth", "Rajulapati", 24),
				new Person("Yaswanth", "Kancherla", 24), new Person("Sai", "Duvvala", 23)

		);

		/*
		 * Collections.sort(lp, new Comparator<Person>(){
		 * 
		 * @Override public int compare(Person o1, Person o2) {
		 * 
		 * return o1.getLastname().compareTo(o2.getLastname()); }
		 * 
		 * });
		 */

		Collections.sort(lp, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));

		// Collections.sort(lp);

		// printAll(lp);
		filterY(lp, p -> true);
		System.out.println();

		System.out.println();

		
		
		/*
		 * filterY(lp, new conditon(){
		 * 
		 * @Override public boolean test(Person p) {
		 * 
		 * return p.getLastname().startsWith("Y");
		 * 
		 * }
		 * 
		 * });
		 */

		filterY(lp, p -> p.getLastname().startsWith("Y"));

	}

	public static void printAll(List<Person> lp) {

		// lp.forEach(System.out::println);

		for (Person p : lp) {
			System.out.println(p);
		}

	}

	private static void filterY(List<Person> lp, conditon c) {

		for (Person p : lp) {

			if (c.test(p)) {
				System.out.println(p);

			}
		}

	}

}

interface conditon {

	boolean test(Person p);

}

class Person /* implements Comparable<Person> */ {

	private String lastname;
	private String firstname;
	private int age;

	public Person(String lastname, String firstname, int age) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [lastname=" + lastname + ", firstname=" + firstname + ", age=" + age + "]";
	}

	/*
	 * @Override public int compareTo(Person person) {
	 * 
	 * return lastname.compareTo(person.lastname); }
	 */

}
