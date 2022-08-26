package Tuan9_Phong;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {
	public static int menu()
	{
		System.out.println("\nMenu:");
		System.out.println("1.Nhap them mot phong");
		System.out.println("2.Tim kiem theo ma");
		System.out.println("3.Xuat toan bo danh sach phong");
		System.out.println("4.Xuat danh sach cac phong dat chuan");
		System.out.println("5.Sap tang theo day nha");
		System.out.println("6.Sap giam theo dien tich");
		System.out.println("7.Sap tang dan theo so luong bong den");
		System.out.println("8.Cap nhap so luong may tinh theo ma");
		System.out.println("9.Xoa 1 phong hoc theo ma");
		System.out.println("10.Tinh tong so phong hoc");
		System.out.println("11.Xuat danh sach cac phong co 60 may");
		System.out.println("0. thoat!");
		System.out.print("chon: ");
		Scanner scan=new Scanner(System.in);
		int chon=scan.nextInt();
		return chon;
	}
	public static void nhapPLyThuyet(DanhSachPhong dsPhong)
	{
		Scanner scan=new Scanner(System.in);
		LyThuyet a=new LyThuyet();
		System.out.println("nhap theo thu tu: Ma phong, day nha, dien tich, so bong den, may chieu(true or false)");
		a.setMaPhong(scan.next());
		a.setDayNha(scan.next());
		a.setDienTich(scan.nextFloat());
		a.setSoBongDen(scan.nextInt());
		a.setCoMayChieu(scan.nextBoolean());
		if(dsPhong.add(a)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	public static void nhapPMayTinh(DanhSachPhong dsPhong)
	{
		Scanner scan=new Scanner(System.in);
		MayTinh a=new MayTinh();
		System.out.println("nhap theo thu tu: Ma phong, day nha, dien tich, so bong den, so luong may tinh)");
		a.setMaPhong(scan.next());
		a.setDayNha(scan.next());
		a.setDienTich(scan.nextFloat());
		a.setSoBongDen(scan.nextInt());
		a.setSoLuongMT(scan.nextInt());
		if(dsPhong.add(a)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	public static void nhapPThiNghiem(DanhSachPhong dsPhong)
	{
		Scanner scan=new Scanner(System.in);
		ThiNghiem a=new ThiNghiem();
		System.out.println("nhap theo thu tu: Ma phong, day nha, dien tich, so bong den, chuyen nganh, suc chua, bon rua(true or false)");
		a.setMaPhong(scan.next());
		a.setDayNha(scan.next());
		a.setDienTich(scan.nextFloat());
		a.setSoBongDen(scan.nextInt());
		a.setChuyenNganh(scan.next());
		a.setSucChua(scan.nextInt());
		a.setCoBonRuaTay(scan.nextBoolean());
		if(dsPhong.add(a)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	public static void main(String[] args) {
		DanhSachPhong dsPhong=new DanhSachPhong(10);
		LyThuyet lt1=new LyThuyet("z","b1",22,2,true);
		LyThuyet lt2=new LyThuyet("n","a1",100,9,false);
		MayTinh mt1=new MayTinh("a","d1",55,10,10);
		MayTinh mt2=new MayTinh("f","f1",10,10,61);
		ThiNghiem tn1=new ThiNghiem("e","a2",80,20,"du lieu",50,true);
		ThiNghiem tn2=new ThiNghiem("c","e1",40,10,"phan mem",80,true);
		dsPhong.add(lt1); dsPhong.add(mt1); dsPhong.add(tn1);
		dsPhong.add(lt2); dsPhong.add(mt2); dsPhong.add(tn2);
		int choose;
		Scanner scan=new Scanner(System.in);
		 do
			{
				choose=menu();
				switch (choose) {
				case 0: {
					break;
				}
				case 1:{
					System.out.println("1. Phong ly thuyet");
					System.out.println("2. Phong may tinh");
					System.out.println("3. Phong thi nghiem");
					System.out.print("chon: ");
					int chon=scan.nextInt();
					if(chon==1) nhapPLyThuyet(dsPhong);
					else if (chon==2) nhapPMayTinh(dsPhong);
					else nhapPThiNghiem(dsPhong);
					break;
				}
				case 2:{
					System.out.print("Nhap ma:");
					String x=scan.next();
					Phong i=dsPhong.search(x);
					if(i instanceof MayTinh) System.out.println(MayTinh.tieude());
					if(i instanceof LyThuyet) System.out.println(LyThuyet.tieude());
					if(i instanceof ThiNghiem) System.out.println(ThiNghiem.tieude());
					System.out.println(i);
					break;
				}
				case 3:
				{
					System.out.println(dsPhong.toString());
					break;
				}
				case 4:
				{
					
					System.out.println(dsPhong.datChuan());
					break;
				}
				case 5:{
					System.out.println("truoc khi sap tang theo day nha:");
					
					System.out.println(dsPhong.toString());
					dsPhong.sortTangDayNha();
					System.out.println("sau khi sap tang theo day nha:");
					
					System.out.println(dsPhong.toString());
					break;
				}
				case 6:
				{
					System.out.println("truoc khi sap giam theo dien tich:");
					
					System.out.println(dsPhong.toString());
					dsPhong.sortGiamDienTich();
					System.out.println("sau khi sap giam theo dien tich:");
					
					System.out.println(dsPhong.toString());
					break;
				}
				case 7:
				{
					System.out.println("truoc khi sap tang theo so luong bong den:");
					
					System.out.println(dsPhong.toString());
					dsPhong.sortTangSLBongDen();
					System.out.println("sau khi sap tang theo so luong bong den:");
					
					System.out.println(dsPhong.toString());
					break;
				}
				case 8:
				{
					System.out.print("Nhap ma can update so luong may: ");
					String x=scan.next();
					System.out.print("Nhap so luong moi: ");
					int soLuong=scan.nextInt();
					if(dsPhong.updateSoMayTinh(x, soLuong)) System.out.println("da thay doi");
					else System.out.println("that bai!");
					break;
				}
				case 9:
				{
					System.out.print("Nhap ma phong hoc can xoa: ");
					String x=scan.next();
					if(dsPhong.search(x)==null) System.out.println("khong tim thay ma");
					else
					{
						System.out.print("Nhap 1 de xoa:");
						int i=scan.nextInt();
						if(i==1) {
							dsPhong.delete(x);
							System.out.println("xoa thanh cong");
						}else System.out.println("xoa that bai");
					}
					break;
				}
				case 10:
				{
					System.out.println("Tong so phong hoc: "+dsPhong.tongSoPhongHoc());
					break;
				}
				case 11:
				{
					if(dsPhong.tren60May()==null) System.out.println("rong");
					else
					{
						System.out.println(MayTinh.tieude());
						for(Phong i: dsPhong.tren60May())
						{
							System.out.println(i);
						}
					}
					
					break;
				}
				default:
					System.out.println("sai cu phap!");
				}
				
			}while(choose!=0);
			System.out.println("Thoat thanh cong!");
	}
	

}
