package com.sapient.client;
import java.util.Scanner;

import  com.sapient.service.interest;


public class interestclient {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the amount");
		double pamt= scan.nextDouble();
		System.out.println("Enter the Years");
		int terms =scan.nextInt();
		System.out.println("Enter the rate");
		float per=scan.nextFloat();
		interest i= new interest();
		i.amt =pamt;
		i.years=terms;
		i.rate=per;
		
		double si=i.calsimple();
		double ci=i.calcompound();
		System.out.println("simple interest" +si);
		System.out.println("compound interest" +ci);
		interest i2= new interest();
		i2.amt =50000;
		i2.years=4;
		i2.rate=4;
		
		double si2=i2.calsimple();
		double ci2=i2.calcompound();
		System.out.println("simple interest" +si2);
		System.out.println("compound interest" +ci2);
		scan.close();
		

	}

}
