package com.atnattey.pta;

import java.util.Scanner;

public class FurnitureTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Furniture f = new Furniture(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(f.getHeight());
        System.out.println(f.getLength());
        System.out.println(f.getWidth());
    }
}

/* 你的代码被嵌在这里*/
class Furniture{
	private int length,width,height;

	public Furniture(int length,int width,int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
