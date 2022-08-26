package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachNhanVien nv = new DanhSachNhanVien();
		nv.themNhanVien(new Experience("123", "nguyễn văn tèo", LocalDate.of(1980, 5, 3), "0338294820", 20));
		nv.themNhanVien(new Fresher("466", "nguyễn thị na", LocalDate.of(1986, 12, 3), "0294992884",
				LocalDate.of(2021, 4, 1), "giỏi"));
		nv.themNhanVien(new Fresher("357", "nguyễn thị tuyết", LocalDate.of(1987, 1, 5), "0294992562",
				LocalDate.of(2021, 5, 2), "giỏi"));
		nv.themNhanVien(new Intern("864", "ngô dần", LocalDate.of(1999, 5, 7), "0232153423", "CNTT", 2));
		nv.themNhanVien(new Experience("235", "nguyễn văn phú", LocalDate.of(1980, 1, 3), "0338294820", 8));
		nv.themNhanVien(new Experience("674", "nguyễn văn hải", LocalDate.of(1980, 4, 2), "0338254820", 30));
		nv.themNhanVien(new Experience("958", "nguyễn thị thơ", LocalDate.of(1980, 6, 7), "0336524820", 10));
		
		System.out.println(nv);
		nv.sapXepTenNhanVienTangDan();
		System.out.println("=====nhân viên sau khi sắp xếp=====");
		System.out.println(nv);
		ArrayList<Employee> kq = nv.getNhanVienKinhnghiem();
		for (Employee employee : kq) {
			System.out.println(employee.toString());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("nhap ma nhan vien can sua: ");
		sc.nextLine();
		String ma = sc.nextLine();
		System.out.println("nhap ngay sua: ");
		sc.nextLine();
	}

}
