package com.atnattey.pta;

import java.util.*;

public class CountCharTest {

/* 此区间是要编写的函数 */
public static int countChar(String string, char c) {
	int cnt =0;
	char[] str = string.toCharArray();
    for(int i=0;i<string.length() ;i++){ 
        if(str[i] == c) cnt++;
    }
    return cnt;
}
/* 此区间是要编写的函数 */

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String s1 = key.nextLine();
        String s2 = key.nextLine();
        System.out.println(countChar(s1, s2.charAt(0)));
    }
}

