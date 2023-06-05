package com.atnattey.pta;

import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextFloat()){
            double r=scanner.nextDouble();
            Circle c = new Circle(r);
            System.out.printf("%.2f %.2f\n",c.getArea(),c.getLength());
            c.radius = 2*r;
            System.out.printf("%.2f %.2f\n",c.getArea(),c.getLength());
        }
    }
}

class Circle{
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getLength() {
    	return 2*radius*Math.PI;
    }
}
