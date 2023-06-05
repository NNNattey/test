package com.atnattey.pta;

import java.util.*;
public class  NumTest{
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        	
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
        reader.close();
    }

    public static int gcd ( int m, int n ) //求最大公约数
    {
        if(n==0) return m;
        return gcd(n, m%n);
    }
    public static int lcm ( int m, int n ) //求最小公倍数
    {
        return m*n/gcd(m, n);
    }
}

