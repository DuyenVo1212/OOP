package Tuan_1;

import java.util.Scanner;

public class Bai9 {
	//in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
	static int xuatSoLanXuatHien(String s)
	{
		char[] c =s.toCharArray();
		int sum=0;
		for(int i=0; i<c.length; i++)
		{
			if(c[i]=='a') sum++;
		}
		return sum;
	}
	public static void main(String[] args) {
		String s;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhap chuỗi: ");
		s=scanner.nextLine();
		System.out.println("Ket qua: "+xuatSoLanXuatHien(s));
	}
	
	

}
