package methodReturnType;


class C6{
	
	Calculator c = new Calculator();
	
	public Calculator m1(){
		
		c.setA(23);
		c.setB(23);
		
		return c;
		
	}

}