package com.suun.step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] num=new int[N];
		int re=0;
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			re+=num[i]*N--;
		}
		System.out.println(re);
		
	}

}
