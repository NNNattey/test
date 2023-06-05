package com.atnattey.pta;

import java.util.Scanner;

public class IsOddTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        System.out.println(isOdd(data));
    }
    
    
    /* 请在这里给出isOdd(i)函数 */
    public static boolean isOdd(int data) {
    	if(data % 2 == 0) return true;
    	else return false;
	}
    
}


