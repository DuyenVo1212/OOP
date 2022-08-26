package Tuan_1;

import java.util.Scanner;

public class Bai3 {
	//in ra tổng 1+3+ …. +n nếu n là số chẵn, 2+4+ …. n nếu n là số lẻ.
	static int inTongChanLe(int n, int chanOrle) {
		int sum=n;
		for(int i=0; i<=n; i++)
			if(i%2==chanOrle) 
				sum+=i;
		return sum;
	}

	public static void main(String[] args) {
		int n, chanOrle;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhap N: ");
		n=scanner.nextInt();
		if(n%2==0) 
		 {chanOrle=1;
	            System.out.println("Đây là số chẵn!");
	        }
		else 
		 {chanOrle =0;
	            System.out.println("Đây là số lẻ!");
	        }
		System.out.println("Ket qua: "+inTongChanLe(n, chanOrle));
		
	}

}