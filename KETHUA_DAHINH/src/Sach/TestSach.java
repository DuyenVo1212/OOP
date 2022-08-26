package Sach;

import java.time.LocalDate;
import java.util.Scanner;

public class TestSach {

	public static void main(String[] args) {
		AListSach ls = new AListSach();
		Scanner sc=new Scanner(System.in);
		
		ls.ThemSach(new SachGK("GK1",LocalDate.of(2016, 3, 15),60000,5,"Vo Chuc Duyen","Moi"));
		ls.ThemSach(new SachTK("TK",LocalDate.of(2016, 4, 15),60000,5,"Vo Chuc Duyen",20));

		int x;
			System.out.println("---------------------------------");
			System.out.println("|\t0. Exit");
			System.out.println("|\t1. Them Sach giao khoa.");
			System.out.println("|\t2. Them Sach tham khao.");
			System.out.println("|\t3. Xuat Sach giao khoa.");
			System.out.println("|\t4. Xuat Sach tham khao.");
			System.out.println("|\t5. Xuat sach theo nha xuat ban.");
			System.out.println("|\t6. Xuat toan bo sach");
			System.out.println("|\t7. Tinh tong trung binh sach");
			System.out.println("|\t8. Xuat sach trong thang 3");
			System.out.println("|\t9. Xuat tong tien theo loai sach");
		
			
			do
			{ 
				System.out.println("Lựa chọn của bạn: ");
				x=sc.nextInt();
				System.out.println("------------------------");
				switch(x) {
					case 1:{
						ls.ThemSach(nhapsgk());
						break;
					}
					case 2:{
						ls.ThemSach(nhapstk());
						break;
					}
					case 3: {
						System.out.printf("%5s %-5s %10s %10s %10s %10s \n","Mã sach","Ngay nhap","Don gia","So luong","Nha xuat ban","Tinh trang","Thuế phải nộp");
						ls.xuatSachGK();
						break;
					}
					case 4:{
						ls.xuatSachTK();
						break;
					}
					case 5:{
						String nxb;
						System.out.println("Nhap nxb can xuat: ");
						//sc.hasNextLine();
						sc.nextLine();
						nxb= sc.nextLine();
						ls.XuatSachNXB(nxb);
						break;
					}
					case 6:{
						ls.XuatSach();
						break;
					}
					case 7:{
						ls.TrungBinh();
						break;
					}
					case 8:{
						ls.SachThang3();
						break;
					}
					case 9:{
						ls.TongTienLoaiSach();
						break;
					}
				}
			
			}while(x!=0);

		}

		public static SachGK nhapsgk() {
			int sluong=0;
			double dgia=0;
			String msach,nxb,ttrang;
			msach=nxb=ttrang=null;
			int ngay,thang,nam;
			boolean check= false;
			Scanner sc= new Scanner(System.in);
			while(!check) {
				System.out.println("Nhap ma sach:");
				msach=sc.nextLine();
				if(msach.equalsIgnoreCase(""))
					System.out.println("Ban phai nhap ma Sach");
				else
					check=true;
			}
			
			System.out.print("Nhap ngay: ");
			ngay=sc.nextInt();
			System.out.print("Nhap thang: ");
			thang=sc.nextInt();
			System.out.print("Nhap nam: ");
			nam=sc.nextInt();
			check=false;
			while(!check) {
				try {
					System.out.println("Nhap don gia Sach: ");
					dgia=sc.nextDouble();
					check=true;
				} catch(Exception e) {
					System.out.println("don gia phai la so............. Nhap lai.");
					sc.nextLine();
				}
			}
			check=false;
			while(!check) {
				try {
					System.out.println("Nhap so luong sach: ");
					sluong=sc.nextInt();
					check=true;
				}catch(Exception e) {
					System.out.println("So luong phai la so. Hay nhap lai...........");
					sc.nextLine();
				}
			}
			sc.nextLine();
			System.out.println("Nhap nha xuat ban: ");
			nxb=sc.nextLine();
			System.out.println("Nhap tinh trang:  ");
			ttrang=sc.nextLine();
			
			SachGK sgk= new SachGK(msach, LocalDate.of(nam, thang, ngay),dgia,sluong,nxb,ttrang);
			return sgk;
			
		}
		
		public static SachTK nhapstk() {
			int sluong=0;
			double dgia=0;
			String msach,nxb;
			double thue=0;
			msach=nxb=null;
			int ngay,thang,nam;
			boolean check= false;
			Scanner sc= new Scanner(System.in);
			while(!check) {
				System.out.println("Nhap ma sach:");
				msach=sc.nextLine();
				if(msach.equalsIgnoreCase(""))
					System.out.println("Ban phai nhap ma Sach");
				else
					check=true;
			}
			
			System.out.print("Nhap ngay: ");
			ngay=sc.nextInt();
			System.out.print("Nhap thang: ");
			thang=sc.nextInt();
			System.out.print("Nhap nam: ");
			nam=sc.nextInt();
			check=false;
			while(!check) {
				try {
					System.out.println("Nhap don gia Sach: ");
					dgia=sc.nextDouble();
					check=true;
				} catch(Exception e) {
					System.out.println("don gia phai la so............. Nhap lai.");
					sc.nextLine();
				}
			}
			check=false;
			while(!check) {
				try {
					System.out.println("Nhap so luong sach: ");
					sluong=sc.nextInt();
					check=true;
				}catch(Exception e) {
					System.out.println("So luong phai la so. Hay nhap lai...........");
					sc.nextLine();
				}
			}
			sc.nextLine();
			System.out.println("Nhap nha xuat ban: ");
			nxb=sc.nextLine();
			
			System.out.println("Nhap thuế  ");
			thue=sc.nextFloat();
			
			SachTK stk= new SachTK(msach, LocalDate.of(nam, thang, ngay),dgia,sluong,nxb,thue);
			return stk;
			
		}
	
	}


//		ls.ThemSach(new SachGK("GK1",LocalDate.of(2016, 3, 15),60000,5,"Tran van A","Moi"));
//		ls.ThemSach(new SachGK("Gk2",LocalDate.of(2017, 5, 15),60000,5,"Tran van B","Cu"));
//		ls.ThemSach(new SachTK("TK",LocalDate.of(2016, 4, 15),60000,5,"Tran van A",50));
//		ls.ThemSach(new SachTK("TK2",LocalDate.of(2016, 3, 15),60000,5,"Tran van B",70));
//		ls.XuatSach();
//		
//	
//		System.out.println("Xuat sach theo NXB:");
//		ls.XuatSachNXB("Tran van A");
//		ls.TongTienLoaiSach();
//		ls.TrungBinh();
//		ls.SachThang3();
		
	
