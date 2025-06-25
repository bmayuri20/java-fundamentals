package ctor;
public class Dog{
	String name;
	String breed;
	int age;
	
	public Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void display(){
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}