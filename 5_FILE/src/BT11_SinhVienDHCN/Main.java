package BT11_SinhVienDHCN;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SVTC svtc=new SVTC();
		Scanner sc=new Scanner(System.in);
		int x;
		while (true) {
			System.out.println("1.Nhap thong tin SVTC");
			System.out.println("2.Xuat thong tin");
			
			x=sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("Nhap thong tin sv");
				svtc.Nhap();
				break;
			case 2:
				System.out.println("Thong tin");
				System.out.println(svtc.toString());
				break;
			}
			
			
		}
		
	}
}
