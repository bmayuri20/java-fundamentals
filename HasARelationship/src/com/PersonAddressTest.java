package com;
public class PersonAddressTest{
	
	public static void main(String[] args){
	
	Address4 address = new Address4();
		address.street = "XYZ";
		address.city = "Pune";
		address.zipcode = 412101;
	
	Person person = new Person();
		person.adr = address;
	
	System.out.println(person.adr.street);
	System.out.println(person.adr.city);
	System.out.println(person.adr.zipcode);
	}
}