package Tuan_1;

import java.util.Scanner;

public class Bai5 {
	//Viết chương trình tìm USCLN của 2 số nhập vào
	static int ucln(int a, int b)
	{
		int[] aa=new int[a];
		int j=0, uocChung=1;
		for(int i=2; i<=a; i++)
			if(a%i==0) 
			{
				aa[j]=i;
				j++;
			}
			
		for(int i=0; i<j; i++)
			if(b%aa[i]==0) uocChung=aa[i];
		
		return uocChung;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a,b: ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Ket qua: "+((a>=b)?ucln(b,a):ucln(a,b)));
	}
}
