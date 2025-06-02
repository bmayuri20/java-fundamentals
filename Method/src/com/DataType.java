package com;
public class DataType{
byte b;
short s;
int i;
float f;
long l;
double d;
char c;
boolean z;
DataTypes dt;
String str;

public void m1(){
  System.out.println(b);
  System.out.println(s);
  System.out.println(i);
  System.out.println(f);
  System.out.println(l);
  System.out.println(d);
  System.out.println(c);
  System.out.println(dt);
  System.out.println(z);
  System.out.println(str);
}
public static void main(String[] args){
		DataType d = new DataType();
		d.m1();

}
}