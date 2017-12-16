package com.saoient.util;
 
import com.sapient.service.Salesperson;

public class SapUtil {
 public static double roundupto2decimal(double val){
	double val2 =Math.round(val*100)/100.0;
	 
	 return val2;
	 
 }
}
