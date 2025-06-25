package app;
// SETTER AND GETTER TASK: -

public class University{
	private String uname;
	private int uid;
	private String uaddress;
	
	public void setUname(String uname){
		this.uname = uname;
	}
	public void setUid(int uid){
		this.uid = uid;
	}
	public void setUaddress(String uaddress){
		this.uaddress = uaddress;
	}
	
	public String getUname(){return uname;}
	public int getUid(){return uid;}
	public String getUaddress(){return uaddress;}
}