package Tuan_2_HCN;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			HinhChuNhat hcn1=new HinhChuNhat("hcn1",2,8);
			
			HinhChuNhat hcn2=new HinhChuNhat();
			hcn2.setChieuDai(5);
			hcn2.setChieuRong(6);
			hcn2.setTen("hcn2");
			
			HinhChuNhat hcn3=new HinhChuNhat();
			nhapMem(hcn3);
			out(hcn3,hcn2,hcn1);
		} catch (Exception e) {
			
		}
		
	}
	static void nhapMem(HinhChuNhat hcn3) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten, chieu dai, chieu rong: ");
		hcn3.setTen(scanner.nextLine());
		hcn3.setChieuDai(scanner.nextInt());
		hcn3.setChieuRong(scanner.nextInt());
	}
	
	static void out(HinhChuNhat hcn3, HinhChuNhat hcn2,HinhChuNhat hcn1)
	{
		System.out.println(hcn1.tieuDe());
		System.out.println(hcn1);
		System.out.println(hcn2);
		System.out.println(hcn3);
	}
	
}
