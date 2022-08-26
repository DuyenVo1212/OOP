package Tuan_1;

public class Bai14 {
	// Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)
	static int xuatTongBoi7() {
		int sum=0;
		for(int i=1; i<=100; i++)
			if(i%7==0) sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(xuatTongBoi7());
	}

}