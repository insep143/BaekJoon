package com.suun.step;

import java.util.Scanner;

public class Step1978 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num[]=new int[101];
		boolean prime = true;
		int enough=0;
		    int count=sc.nextInt();
		    for(int i=0;i<count;i++){
		        num[i]=sc.nextInt();
		        if(num[i] != 1){
		            for(int j=2;j<num[i];j++){
		                if(num[i]%j==0) {
		                    prime = false;
		                    break;
		                }
		            }
		            if(prime==true)
		                enough++;
		            else
		                prime = true;
		        }      
		    }
		    sc.close();
		    System.out.println(enough);
		}

}
