package Tuan_1;
public class Bai13 {
	//Viết chương trình in ra những số lẻ từ 1 đến 99.
	static void inSoLe1Den99(int n) {
		for(int i=1; i<=n; i++)
			if(i%2==1) 
				System.out.println(i+"\t");
	}

	public static void main(String[] args) {
		int n=99;
		inSoLe1Den99(n);

	}

}

