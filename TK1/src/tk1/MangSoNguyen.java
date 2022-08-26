package tk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangSoNguyen {
	public int n;
	public int a[] = new int[n];
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public MangSoNguyen(int n, int[] a) {
		super();
		this.n = n;
		this.a = a;
	}
	

	public MangSoNguyen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void nhapMang(int a[], int n) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<n; i++) {
			System.out.println("nhap a["+ (i+1) +"] = ");
			a[i] = scanner.nextInt();
		}
	}
	
	public void xuatMang(int a[], int n) {
		for(int i = 0; i<n; i++) {
		System.out.print(a[i]+"  ");
		}
	}
	
	public boolean kiemTraSNT(int x) {
		 int i;
	        if (x<2) return false;
	        for (i=2; i<=Math.sqrt(x); i++)
	            if (x%i==0)
	                return false;
	        return true;
		
	}
	
	public void inSNT(int a[], int n) {
		int kt=0;
		for(int i=0; i<n;i++) {
			
			if(kiemTraSNT(a[i])) {
				System.out.print(a[i] + "  ");
				kt++;
			}
			
		}
		if(kt==0) {
			System.out.println("	-Khong co SNT nao!");
		}
	}
	
	public int timSNTLonNhat(int a[], int n) {
		int max= 0;
		for(int i=0; i<n;i++) {
			if(kiemTraSNT(a[i])) {
				int temp = a[i];
				if(temp > max)
					max=temp;
			}
		}
		return max;
	}
	
	public void xoa(int a[], int n) {
		int x;
		int temp=0,count=0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhap gia tri muon xoa: ");
			x = scanner.nextInt();
			for(int i = 0; i<n; i++) {
				if(x==a[i]) {
					for(int j = i; j <n-1; j++ ) {
						a[j] = a[j+1];
					}
				count++;
				}else {
					temp++;
				}
			}
			if(count!=0) {
				System.out.println("-Da xoa phan tu co gia tri "+x+ " thanh cong!");
				n = n-count;
				if(n!=0) {
					System.out.println("mang sau khi xoa la :");
					for(int q = 0; q<n; q++) {
						System.out.print(a[q]+"  ");					
					}
				}else {
					System.out.println("mang sau khi xoa la :");
					System.out.println("	-mang rong!");
				}	
			}else {
				System.out.println("khong tim thay gia tri "+x+" trong mang de xoa!");
				System.out.println("Vui long kiem tra lai gia tri muon xoa!");
				System.out.println();
			}
			scanner.close();
		} while (count == 0);	
	}
}