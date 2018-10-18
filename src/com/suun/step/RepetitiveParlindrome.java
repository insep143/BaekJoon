package com.suun.step;

import java.util.Scanner;

public class RepetitiveParlindrome {
	
	private static boolean P(String s) {
		int x=0;
		int y=s.length()-1;
		while(x<y) {
			if(s.charAt(x)!=s.charAt(y))return false;
			x++;
			y--;
		} 
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(P(s)?"YES":"NO");
		sc.close();
	}

}
