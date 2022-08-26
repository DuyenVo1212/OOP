package Tuan_1;
import java.util.Scanner;

public class Bai19 {
	//in ra tam giac voi cac dau * co chieu cao bang n
	static void inTamGiacCaoN(int n) {
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || j==i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int i=1; i<=n; i++)
			System.out.print("*");
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap N: ");
		n=scanner.nextInt();
		inTamGiacCaoN(n);
	}

}
