package com.task10;

//Q1
class Person {
	// instance variable
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
////listener method to display student details
// public void displayInfo() {
//	 System.out.println("Name" +name);
//	 System.out.println("Age" +age);
// }
 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}
