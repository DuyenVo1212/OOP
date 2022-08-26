package tk1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap vao do dai mang n = ");
			n = scanner.nextInt();			
		}while(n<=0 && n>100);
		int a[] = new int[n];
		MangSoNguyen mang = new MangSoNguyen();
		System.out.println("Moi nhap mang:");
		mang.nhapMang(a, n);
		System.out.println("Cac phan tu trong mang la:");
		mang.xuatMang(a, n);
		System.out.println();
		System.out.println("Cac so nguyen to trong mang la:");
		mang.inSNT(a, n);
		System.out.println();
		System.out.println("So nguyen to lon nhat trong mang la:");
		int max = mang.timSNTLonNhat(a, n);
		if(max==0)
			System.out.println("	-Khong co SNT lon nhat!");
		else {
			System.out.println(max);
		}
		mang.xoa(a, n);
	}

}
