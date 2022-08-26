package BT2.Bai6.src.Class;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List ql = new List();

		ql.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

		sc.close();
	}

}
