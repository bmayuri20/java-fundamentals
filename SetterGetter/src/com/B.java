package com;
public class B{
	private byte by;
	private short s;
	private int i;
	private float f;
	private long l;
	private double d;
	private char c;
	private boolean flag;
	private B b;
	private String str;
	
	public void setByte(byte by)         {this.by = by;}
	public void setShort(short s)        {this.s = s;}
	public void setInt(int i)            {this.i = i;}
	public void setFloat(float f)        {this.f = f;}
	public void setLong(long l)	         {this.l = l;}
	public void setDouble(double d)      {this.d = d;}
	public void setChar(char c)		     {this.c = c;}
	public void setBoolean(boolean flag) {this.flag = flag;}
	public void setB(B b)				 {this.b = b;}
	public void setString(String str)    {this.str = str;}   
	
	public byte getByte()       {return by;}
	public short getShort()     {return s;}
	public int getInt()         {return i;}
	public float getFloat()     {return f;}
	public long getLong()       {return l;}
	public double getDouble()   {return d;}
	public char getChar()       {return c;}
	public boolean getBoolean() {return flag;}
	public B getB() 			{return  b;}
	public String getString()   {return str;}
	

}