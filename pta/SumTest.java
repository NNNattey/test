package com.atnattey.pta;

import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int start,end;

        for(int i = 0;i < a.length; i++){
            a[i] = input.nextInt();
        }

        System.out.println(sum(a));

        start = input.nextInt();
        System.out.println(sum(a, start));
            
        start = input.nextInt();
        end = input.nextInt();
        System.out.println(sum(a, start, end));
    }
    
    //求数组a中所有元素的和
    public static int sum(int[] a){
    	int ans = 0;
    	for(int i=0;i<a.length;i++)
    		ans += a[i];
    	return ans;
    }

    //求数组a中下标从start开始到数组末尾的元素的和
    public static int sum(int[] a, int start){
        if(start == a.length) return 0;
        else return a[start] + sum(a,start+1);
    } 

    //求数组a中下标从start开始到end-1的元素的和
    public static int sum(int[] a, int start, int end){
    	int ans = 0;
        if(start<0) start = 0;
        if(end > a.length) end = a.length;
        if(start == end) return a[start];
    	for(int i=start;i<end;i++)
    		ans += a[i];
    	return ans;
    }
}

