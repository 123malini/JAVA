package pack2;

import java.util.Scanner;

import pack1.Car;

public class Childcar extends Car {
	@Override
	  public void basecar(){
		  Scanner sc= new Scanner(System.in);
		  enginecc=sc.nextInt();
		System.out.println("a value of enginecc");
		if (enginecc==1000) {
			System.out.println("enginecc belongs to sedan");
		}  
		else if (enginecc==1200) {
			System.out.println("enginecc belongs to suv");
		}
		else if (enginecc==900) {
			System.out.println("enginecc belongs to hatchback");
		} else {
			System.out.println("no car is available");
		}{
			
		}
		}
	}

	
	


