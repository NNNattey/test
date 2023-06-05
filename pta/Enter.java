package com.atnattey.pta;

import java.util.Scanner;
public class Enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 设置一个Scanner对象
        int m = sc.nextInt();                   // 输入数组长度m
        int []array = new int[m];               // 分配一个长度为m的动态数组
        for(int i=0; i<m; i++){                 // 输入m个数字
            array[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){                 // 输出
            System.out.printf("%d ", array[i]);
        }
    }
}