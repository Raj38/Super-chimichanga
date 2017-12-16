package com.sapient.client;

import com.sapient.service.Area_peri;;

public class Area_periclient {

	public static void main(String[] args) {
		Area_peri i= new Area_peri();
		
		i.rad=5;
		

		double area=i.area();
		double perimeter=i.perimeter();
		System.out.println("Area " +area);
		System.out.println("Perimeter " +perimeter);

	}
}


