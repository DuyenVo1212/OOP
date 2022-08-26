package Tuan8_NhaDat_menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void tuade() {
		String str = "";
		str += String.format("%10s %10s %10s %10s %10s %10s %10s", "ma", "ngayGD", "donGia", "loai", "dienTich",
				"thanhTien", "DiaChi");
		System.out.println(str);
	}

	public static void nhapMemNha(List<NhaDat> a) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		Nha aa = new Nha();
		System.out.print("Nhap ma: ");
		aa.setMa(scan.next());
		System.out.print("Nhap ngayGD: ");
		aa.setNgayGD(formatter.parse(scan.next()));
		System.out.print("Nhap donGia: ");
		aa.setDonGia(scan.nextInt());
		System.out.print("Nhap loai: ");
		aa.setLoai(scan.next());
		System.out.print("Nhap dienTich: ");
		aa.setDienTich(scan.nextInt());
		System.out.print("Nhap DiaChi: ");
		aa.setAddress(scan.next());
		if (a.add(aa))
			System.out.println("Them thanh cong!");
		else
			System.out.println("Them that bai!");
	}

	public static void nhapMemDat(List<NhaDat> a) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		Dat aa = new Dat();
		System.out.print("Nhap ma: ");
		aa.setMa(scan.next());
		System.out.print("Nhap ngayGD: ");
		aa.setNgayGD(formatter.parse(scan.next()));
		System.out.print("Nhap donGia: ");
		aa.setDonGia(scan.nextInt());
		System.out.print("Nhap loai: ");
		aa.setLoai(scan.next());
		System.out.print("Nhap dienTich: ");
		if (a.add(aa))
			System.out.println("Them thanh cong!");
		else
			System.out.println("Them that bai!");
	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("1. Nhap them 1 giao dich");
		System.out.println("2. Xuat DS giao dich");
		System.out.println("3. Trung binh thanh tien");
		System.out.println("4. Xuat DS giao dich thang 9 nam 2013");
		System.out.println("0. Thoat");
		System.out.print("Chon: ");
		int choose = scan.nextInt();
		return choose;
	}

	public static void tbThanhTien(List<NhaDat> a) {
		float sum = 0;
		for (NhaDat i : a) {
			sum += i.thanhTien();
		}
		System.out.println("Trung binh thanh tien: " + sum / a.size());
	}

	public static void xuatCacGiaoDich9_013(List<NhaDat> a) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		for (NhaDat i : a) {
			if (i.getNgayGD().after(formatter.parse("01/9/2013"))
					&& i.getNgayGD().before(formatter.parse("30/9/2013"))) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Dat d1 = new Dat("d01", formatter.parse("20/9/2013"), 200, "A", 100);
		Dat d2 = new Dat("c03", formatter.parse("20/12/2022"), 400, "C", 50);
		Nha n1 = new Nha("a01", formatter.parse("21/12/2020"), 50, "thuong", 150, "HCM");
		Nha n2 = new Nha("g03", formatter.parse("2/9/2013"), 150, "cao cap", 10, "HaNoi");
		List<NhaDat> listNhaDat = new ArrayList<NhaDat>(10);
		listNhaDat.add(d1);
		listNhaDat.add(n1);
		listNhaDat.add(n2);
		listNhaDat.add(d2);
		int choose;
		do {
			choose = menu();
			switch (choose) {
			case 0: {
				break;
			}
			case 1: {
				Scanner scan = new Scanner(System.in);
				System.out.println("1. giao dich nha");
				System.out.println("2. giao dich dat");
				System.out.print("chon: ");
				int chon = scan.nextInt();
				if (chon == 2)
					nhapMemDat(listNhaDat);
				else
					nhapMemNha(listNhaDat);
				break;
			}
			case 2: {
				tuade();
				for (NhaDat i : listNhaDat) {
					System.out.println(i);
				}
				break;
			}
			case 3: {
				tbThanhTien(listNhaDat);
				break;
			}
			case 4: {
				xuatCacGiaoDich9_013(listNhaDat);
				break;
			}
			default:
				System.out.println("sai cu phap!");
			}

		} while (choose != 0);
		System.out.println("Thoat thanh cong!");
	}

}
