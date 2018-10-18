package com.suun.step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step9020 {

	private static int SIZE=10001;
	private static boolean[] isNotPrime=new boolean[SIZE];

	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(in.readLine());
		eratosthenes();
		while(T-->0) {
			sb.append(goldBash(Integer.parseInt(in.readLine())));
		}
		out.write(sb.toString());
		out.close();
		in.close();
	}

	private static void eratosthenes() {
		int i,j;
		for(i=2;i*i<SIZE;i++) 
			if(!isNotPrime[i])
				for(j=i*i;j<SIZE;j+=i)isNotPrime[j]=true;
		isNotPrime[1]=true;
	}

	private static String goldBash(int n) {
		int i, j, mid=n>>>1;
		for(i=j=mid;i<=n;i--,j++) 
			if(!isNotPrime[i]&&!isNotPrime[j])break;
		return String.format("%d %d\n", i,j);
	}
}
