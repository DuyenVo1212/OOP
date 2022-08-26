package BT2;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args){
		//Tạo đối tượng sv1 bằng constructor đầy đủ tham số:
		SinhVien sv1=new SinhVien(11111,"Võ Chúc Duyên",6.5f,8.5f);
		
		//Tạo đối tượng sv2 bằng default constructor:
		SinhVien sv2 = new SinhVien();
		sv2.setMaSV(22222);
		sv2.setHoTen("Lê Thị Bông");
		sv2.setDiemLT(7.5f);
		sv2.setDiemTH(8.0f);
		
		//Tạo đối tượng sv3 :
		SinhVien sv3=new SinhVien();
		//Nhập dữ liệu của sinh viên sv từ bàn phím
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhap ma so cua sinh vien sv3");
		int masv=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho va ten cua sinh vien sv3 : ");
		String hoten=sc.nextLine();
		System.out.println("Nhap diem ly thuyet cua sinh vien sv3 : ");
		float diemlt=sc.nextFloat();
		System.out.println("Nhap diem thuc hanh cua sinh vien sv3 : ");
		float diemth=sc.nextFloat();
	
		sv3 = new SinhVien(masv,hoten,diemlt,diemth);
		
		//In thông tin
		System.out.println(sv1.TieuDe());
		System.out.println(sv1.toString());
		System.out.println(sv2);
		System.out.println(sv3);
		
		sc.close();

	}

}
