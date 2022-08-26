package BT1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chieu dai");
		int chieuDai=sc.nextInt();
		System.out.println("Nhap chieu rong");
		int chieuRong=sc.nextInt();
		
		hcn = new HinhChuNhat(chieuDai,chieuRong);
		System.out.println(hcn.TieuDe());
		System.out.println(hcn.toString());
	}
	
}
