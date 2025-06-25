package app;
// SETTER AND GETTER TASK: -

public class CompanyTest{
	public static void main(String[] args){
	Company company = new Company();
	
	company.setCName("MICROSOFT");
	company.setCId(1);
	company.setArea(10000.6f);
	company.setAddress("Pune");
	company.setMobNo(99999999l);
	
	System.out.println(company.getCName());
	System.out.println(company.getCId());
	System.out.println(company.getArea());
	System.out.println(company.getAddress());
	System.out.println(company.getMobNo());
	}
}