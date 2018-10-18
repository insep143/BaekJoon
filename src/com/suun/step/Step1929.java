package com.suun.step;

import java.util.Scanner;

public class Step1929 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean[] arr=new boolean[n2+1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=true;
		}
		for(int i=2;i<n2+1;i++) {
			if(arr[i]==true) {
				if((i*i)>1000001)break;
				else {
					for(int j=i*i;j<n2+1;) {
						arr[j]=false;
						j=j+i;
					}
				}
			}
		}
		if(n1==1) n1++;
		
		for(int i=n1;i<n2+1;i++) {
			if(arr[i] && i>=n1)System.out.print(i+" ");
		}
		sc.close();
	}

}
