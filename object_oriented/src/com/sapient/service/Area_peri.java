/**
 * 
 */
package com.sapient.service;

/**
 * @author rcha38
 *
 */
public class Area_peri {

	/**
	 * @param args
	 */
	public float rad;
	
	public  double area()
	{
		double area = Math.PI * rad * rad;
		return area;
	}
	public  double perimeter()
	{
		double perimeter= 2* Math.PI * rad;
		return perimeter ;
	}

	}


