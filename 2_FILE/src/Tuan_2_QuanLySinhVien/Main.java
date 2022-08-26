package Tuan_2_QuanLySinhVien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SinhVien sv1=new SinhVien(20049891,"Nguyen van son", 9f, 8f);
		SinhVien sv2=new SinhVien();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap mssv, ho ten, diem LT, diem TH: ");
		SinhVien sv3=new SinhVien(scanner.nextInt(), scanner.next(), 
				scanner.nextFloat(), scanner.nextFloat());
		System.out.println(sv1.tieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
