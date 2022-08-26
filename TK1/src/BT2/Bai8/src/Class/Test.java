package BT2.Bai8.src.Class;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql = new QuanLy();

		ql.nhapDanhSach(sc);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql.timKiem(8000000);

		sc.close();
	}

}
