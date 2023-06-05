package com.atnattey.pta;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    double w = input.nextDouble();
	    double h = input.nextDouble();
	    Rectangle myRectangle = new Rectangle(w, h);
	    System.out.println(myRectangle.getArea());
	    System.out.println(myRectangle.getPerimeter());

	    input.close();
	  }
}

class Rectangle {
	private double weight=1,height=1;
	
	public Rectangle() {
	}
	
	public Rectangle(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double getArea() {
		return weight*height;
	}
	
	public double getPerimeter() {
		return 2*(weight+height);
	}
}