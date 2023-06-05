package com.atnattey.pta;

import java.util.Scanner;
public class WeChatTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeChat weChat1 = new WeChat(scanner.next(), scanner.next());
        WeChat weChat2 = new WeChat(scanner.next(), scanner.next());
        System.out.println(weChat1);
        System.out.println(weChat2);
        System.out.println(weChat1.equals(weChat2));

        scanner.close();
    }
}

class WeChat{
	private String number,nickName;

	public WeChat(String number, String nickName) {
		super();
		this.number = number;
		this.nickName = nickName;
	}
	
	public boolean equals(WeChat wChat) {
		if(this.number.equals(wChat.number)) return true;
		else return false;
	}
	
	public String toString() {
		return "WeChat: "+ this.number+ ", nicename: " + this.nickName;
	}
}
