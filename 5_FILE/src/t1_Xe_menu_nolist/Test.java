package t1_Xe_menu_nolist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void tuade() {
		String str = "";
		str += String.format("%10s %10s %10s %10s %15s %15s", "maSoChuyen", "hoTen", "soXe", "doanhThu",
				"soTuyen/NoiDen", "soKm/NgayDiDuoc");
		System.out.println(str);
	}

	public static void nhapMemNoiThanh(List<Xe> a) {
		Scanner scan = new Scanner(System.in);
		NoiThanh nt = new NoiThanh();
		System.out.print("Nhap maSoChuyen:");
		nt.setMaSoChuyen(scan.nextLine());
		System.out.print("Nhap hoTen:");
		nt.setHoTen(scan.nextLine());
		System.out.print("Nhap soXe:");
		nt.setSoXe(scan.nextInt());
		System.out.print("Nhap doanhThu:");
		nt.setDoanhThu(scan.nextInt());
		System.out.print("Nhap soTuyen:");
		nt.setSoTuyen(scan.nextInt());
		System.out.print("Nhap soKm:");
		nt.setSoKm(scan.nextInt());
		if (a.add(nt))
			System.out.println("Them thanh cong!");
		else
			System.out.println("Them that bai!");
	}

	public static void nhapMemNgoaiThanh(List<Xe> a) {
		Scanner scan = new Scanner(System.in);
		NgoaiThanh nt = new NgoaiThanh();
		System.out.print("Nhap maSoChuyen:");
		nt.setMaSoChuyen(scan.nextLine());

		System.out.print("Nhap hoTen:");
		nt.setHoTen(scan.nextLine());

		System.out.print("Nhap soXe:");
		nt.setSoXe(scan.nextInt());
		System.out.print("Nhap doanhThu:");
		nt.setDoanhThu(scan.nextInt());
		System.out.print("Nhap NoiDen:");
		nt.setNoiDen(scan.next());
		System.out.print("Nhap NgayDiDuoc:");
		nt.setNgayDiDuoc(scan.nextInt());
		if (a.add(nt))
			System.out.println("Them thanh cong!");
		else
			System.out.println("Them that bai!");
	}

	public static void tongDoanhThu(List<Xe> list) {
		int tong = 0;
		for (Xe i : list) {
			tong += i.getDoanhThu();
		}
		System.out.println("Tong doanh thu: " + tong);
	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("1. Nhap them 1 chuyen xe");
		System.out.println("2. Xuat DS chuyen xe");
		System.out.println("3. Tong doanh thu cua tat ca cac chuyen xe");
		System.out.println("0. Thoat");
		System.out.print("Chon: ");
		int choose = scan.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		NoiThanh nt1 = new NoiThanh("d02", "Thi An", 20039, 200000, 1, 200);
		NoiThanh nt2 = new NoiThanh("a01", "Thi Na", 20021, 100000, 2, 100);
		NgoaiThanh ngt1 = new NgoaiThanh("b03", "Thi Hoa", 20032, 150000, "HaNoi", 30);
		NgoaiThanh ngt2 = new NgoaiThanh("c02", "Thi Kha", 20012, 300000, "HCM", 45);
		List<Xe> listXe = new ArrayList<Xe>();
		listXe.add(nt1);
		listXe.add(nt2);
		listXe.add(ngt1);
		listXe.add(ngt2);

		int choose;
		do {
			choose = menu();
			switch (choose) {
			case 0: {
				break;
			}
			case 1: {
				Scanner scan = new Scanner(System.in);
				System.out.println("1. Chuyen xe noi thanh");
				System.out.println("2. Chuyen xe ngoai thanh");
				System.out.print("chon: ");
				int chon = scan.nextInt();
				if (chon == 2)
					nhapMemNgoaiThanh(listXe);
				else
					nhapMemNoiThanh(listXe);
				break;
			}
			case 2: {
				tuade();
				for (Xe i : listXe) {
					System.out.println(i);
					break;
				}
			}
			case 3: {
				tongDoanhThu(listXe);

				break;
			}

			default:
				System.out.println("sai cu phap!");
			}

		} while (choose != 0);
		System.out.println("Thoat thanh cong!");
	}

}
