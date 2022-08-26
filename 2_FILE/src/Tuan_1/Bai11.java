package Tuan_1;

import java.util.Scanner;

public class Bai11 {
	//Viết hàm để đếm số lượng ký tự là số có trong chuỗi s
	public static void main(String[] args) {
		String s;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		s=scanner.nextLine();
		System.out.print("Ket qua: "+xuatSoLuongKyTuSo(s));
	}
	static int xuatSoLuongKyTuSo(String s)
	{
		int sum=0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)>=48 && s.charAt(i)<=57) sum++;
		
		return sum;
	}
}
