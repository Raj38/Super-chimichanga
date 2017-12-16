package com.sapient.client;
import com.sapient.service.Salesperson;
import com.saoient.util.SapUtil;
public class Salespersonclient {

	public static void main(String[] args) {
		Salesperson s1= new Salesperson (1001,"ram",45000);
		Salesperson s2= new Salesperson (1002,"tom",65000);
		Salesperson s3= new Salesperson (1003,"rom",5000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("No of Persons  " +  Salesperson.noofperson) ;
		System.out.println("Total sales  " +  Salesperson.tsales);
		double value=45560.223558;
		System.out.println("VALUE  " + SapUtil.roundupto2decimal(value));
	}

}
