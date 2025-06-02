package com;
class Company{
	public void trainee()
		{System.out.println("Hello this is Trainee");}
	public void teamLead()
		{System.out.println("Hello this is Team Lead");}
	public void manager()
		{System.out.println("Hello this is Manager");}
	public void seniorManager()
		{System.out.println("Hello this is Senior Manager");}
	public void director()
		{System.out.println("Hello this is Director");}
	public void seniorDirectorvicePresident()
		{System.out.println("Hello this is Senior Director");}
	public void vicePresident()
		{System.out.println("Hello this is Vice President");}
	public void chiefExecutiveOfficers()
		{System.out.println("Hello this is Chief Executive Officers");}
}
		
public class CompanyTest{
	public static void main (String[] args){
		Company company = new Company();
		company.trainee();
		company.teamLead();
		company.manager();
		company.seniorManager();
		company.director();
		company.seniorDirectorvicePresident();
		company.vicePresident();
		company.chiefExecutiveOfficers();
	}
}