package com.task10;

public class PersonBase {

	public static void main(String[] args) {
	
		//create a person object
		Person person1 =new Person("Ajay",25);
		Person person2 =new Person("Amar",20);
		Person person3 =new Person("Ram",1);

		
		// access instance variable using getter method
		String name1=person1.getName();
		int age1=person1.getAge();
		System.out.println("Name: "+name1);
		System.out.println("Age: "+age1);
		
		String name2=person2.getName();
		int age2=person2.getAge();
		System.out.println("Name: "+name2);
		System.out.println("Age: "+age2);
		
		String name3=person3.getName();
		int age3=person3.getAge();
		System.out.println("Name: "+name3);
		System.out.println("Age: "+age3);
	}

}
//Result
/*
 * Name: Ajay
Age: 25
Name: Amar
Age: 20
Name: Ram
Age: 1
 */

