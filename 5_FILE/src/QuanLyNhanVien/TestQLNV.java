package QuanLyNhanVien;

import java.util.Scanner;

public class TestQLNV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chon;
		Scanner sc = new Scanner(System.in);
		ListEmployee list = new ListEmployee();
		do {
			System.out.println("\t\t========= M-E-N-U ==========");
			System.out.println("\t1.them mot employee vao danh sach");
			System.out.println("\t2.in toan bo danh sach phong hoc");
			System.out.println("\t3.in danh sach Intern");
			System.out.println("\t4.in danh sach Experience");
			System.out.println("\t5.in danh sach Fresher");
			System.out.println("\t6.xoa employee theo ID");
			System.out.println("\t7.sua employee theo ID");
			System.out.println("\t0.thoat");
			System.out.print("\tMoi nhap lua chon: ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1:
				int loai;
				System.out.println("chon loai muon nhap : \n\t0.Experience \n\t1.Fresher \n\t2.Intern");
				loai = sc.nextInt();
				sc.nextLine();
				list.addEmployee(sc, loai);
				System.out.println();
				break;
			case 2:
				System.out.println("Danh sach cac nhan vien: ");
				list.PrintList();
				System.out.println();
				break;
			case 3:
				System.out.println("Danh sach cac nhan vien Intern: ");
				list.getIntern();
				System.out.println();
				break;
			case 4:
				System.out.println("Danh sach cac nhan vien Experience: ");
				list.getExperience();
				System.out.println();
				break;
			case 5:
				System.out.println("Danh sach cac nhan vien Fresher: ");
				list.getFresher();
				System.out.println();
				break;
			case 6:
				System.out.print("nhap ID  employee muon xoa: ");
				String id = sc.nextLine();
				list.Remove(id);
				System.out.println();
				break;
			case 7:
				System.out.println("Nhap ID muon sua: ");
				String id1=sc.nextLine();
				list.updateEmployee(id1, sc);
				break;
			}
		} while (chon != 0);
	}

}
