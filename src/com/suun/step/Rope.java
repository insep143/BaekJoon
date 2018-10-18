package com.suun.step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rope {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int k=arr[0];
		for(int i=1;i<N;i++) {
			int temp=arr[i]*(i+1);
			if(temp>k)k=temp;
		}
		System.out.println(k);
	}

}
