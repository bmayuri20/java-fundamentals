package app;
// SETTER AND GETTER TASK: -

public class Data{
	
	public void setData(Employee e){
		e.setName("XYZ");
		e.setId(1);
		e.setSalary(89000);
		e.setMobNo(8956232682l);
		e.setAddress("India");
	}
	public void getData(Employee e){
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSalary());
		System.out.println(e.getAddress());
		System.out.println(e.getMobNo());
		
	}
	public static void main(String[] args){
		
		Employee emp = new Employee();
		
		Data data = new Data();
		
		data.setData(emp);
		data.getData(emp);
	}
}