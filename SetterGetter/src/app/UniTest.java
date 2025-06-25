package app;
// SETTER AND GETTER TASK: -

public class UniTest{
	public static void main(String[] args){
	
		University uni = new University();
		Collage clg = new Collage();
		
		uni.setUname("RTMNU");
		uni.setUid(8);
		uni.setUaddress("Nagpur");
		
		clg.setClgName("DMIETR");
		clg.setClgId(4);
		clg.setClgAddress("Wardha");
		
		System.out.println(uni.getUname());
		System.out.println(uni.getUid());
		System.out.println(uni.getUaddress());
		
		System.out.println(clg.getClgName());
		System.out.println(clg.getClgId());
		System.out.println(clg.getClgAddress());
	}
}