package app;
// SETTER AND GETTER TASK: -

public class Company{
	private String cName;
	private int cId;
	private float area;
	private String address;
	private long mobNo;

	public void setCName(String cName){
		this.cName = cName;
	}
	public void setCId(int cId){
		this.cId = cId;
	}
	public void setArea(float area){
		this.area = area;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setMobNo(long mobNo){
		this.mobNo = mobNo;
	}
	
	public String getCName(){return cName;}
	public int getCId(){return cId;}
	public float getArea(){return area;}
	public String getAddress(){return address;}
	public long getMobNo(){return mobNo;}
}