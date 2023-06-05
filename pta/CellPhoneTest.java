package com.atnattey.pta;

import java.util.Scanner;
public class CellPhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CellPhone c1 = new CellPhone(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        CellPhone c2 = new CellPhone(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);
    }
}

/* 你的代码将被嵌在这里 */
class CellPhone{
	private String modelNumber;
	private int memorySize,storageSize,price;
	public CellPhone(String modelNumber, int memorySize, int storageSize, int price) {
		this.modelNumber = modelNumber;
		this.memorySize = memorySize;
		this.storageSize = storageSize;
		this.price = price;
	}
	public Boolean equals(CellPhone cellPhone) {
		if(!this.modelNumber.equals(cellPhone.modelNumber)) return false;
		if(this.memorySize != cellPhone.memorySize) return false;
		if(this.storageSize != cellPhone.storageSize) return false;	
		else return true;
	}
	
	public String toString() {
		return "CellPhone [model:" + modelNumber +", memory:"+ memorySize + ", storage:"+ storageSize+", price:" + price + "]";
	}
	
}