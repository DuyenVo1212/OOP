package Tuan_1;

import java.util.Scanner;

public class Bai4 {
	//Viết chương trình giải phương trình bậc 1.
	public static void main(String[] args) {
		int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhap a, b: ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		if(a==0)
		{
			if(b==0) System.out.println("pt vo so nghiem");
			else System.out.println("Phuong trinh vo nghiem");
		}
		else System.out.println("x= "+(float)(-b/a));
	}

}
