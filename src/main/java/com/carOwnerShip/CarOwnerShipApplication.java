package com.carOwnerShip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CarOwnerShipApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter carOwnerName");

		String name=scanner.nextLine();

		while(true){

			System.out.println("please select your car type \n 1. sports car \n 2. Normal Car \n 3. Truck");

			int userChoice=scanner.nextInt();

			switch (userChoice){
				case 1-> {
					Car car= (Car) context.getBean("sportsCar");
					car.setOwnerName(name);
					car.getInfo();
					break;
				}
				case 2->{
					Car car=(Car) context.getBean("normalCar");
					car.setOwnerName(name);
					car.getInfo();
					break;
				}
				case 3->{
					Car car=(Car) context.getBean("truck");
					car.setOwnerName(name);
					car.getInfo();
					break;
				}

			}

		}


	}

}
