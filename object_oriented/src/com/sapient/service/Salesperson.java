package com.sapient.service;

public class Salesperson {
    public int id;
    public String name;
    public double samt;
    public static int noofperson;
	public static double tsales;
    
    
 
    
    public Salesperson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
		++noofperson;
		tsales=tsales+this.samt; 
		
		
	}




	public double calcsalescomm()
    {
    	double sc=0;
    	if(samt>=50000)
    		sc=samt* 0.1;
    	else 
    	    if(samt>=20000 && samt<=50000)
		     sc= samt*0.05 ;
    	    else 
    	    	if(samt<=20000)
    	    		sc=samt*0.03;
    	return sc;
}
	public void display(){
		System.out.println(id  +" " + name  +"" + samt  +"");
	}
}