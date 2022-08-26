package Tuan_1;

public class Bai17 {
	// Viết chương trình in ra bội số của 3 từ 300 đến 3.
	static void inBoi3() {
		for(int i=300; i>=3; i--)
			if(i%3==0) System.out.println(i+" ");
	}
	public static void main(String[] args) {
		inBoi3();
	}

}
