package B_QuanLySinhVien_noa;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static int menu()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("\nMenu: ");
		System.out.println("1. Nhap cung");
		System.out.println("2. Xuat toan bo nhan vien");
		System.out.println("3. Tong so tien phai tra cho nhan vien");
		System.out.println("4. Thong tin nguoi lap trinh vien");
		System.out.println("5. Sap xep theo ten nhan vien");
		System.out.println("6. Sua thong tin");
		System.out.println("7. Xoa nhan vien");
		System.out.println("0. Thoat!");
		System.out.print("chon: ");
		int chon=scan.nextInt();
		return chon;
	}
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###$");
		SoftwareHouse1 sf = new SoftwareHouse1("SamSung");
		
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
					sf.addEmployee(new Administrator1(123, "Nguyen van Kiet", 10000, "C"));
					sf.addEmployee(new Administrator1(987, "Nguyen thi Hoa", 10000, "HTML"));
					sf.addEmployee(new Programmer1(456, "Nguyen Vn Bang", 2000, "Python"));
					sf.addEmployee(new Programmer1(789, "Hue Huong", 3000, "Java"));
					sf.addEmployee(new ProjectLeader1(321, "Van Ho", 40000000, "C#"));
					sf.addEmployee(new ProjectLeader1(654, "Joon", 5000000, "Js"));
					break;
				}
				case 2:{
					System.out.println("Thông tin toàn bộ nhân viên là:");
					System.out.println(sf.displayAllStaff());
					break;
				}
				case 3:
				{
					System.out.println("Tổng số tiền phải trả cho nhân viên là: " + df.format(sf.getMonthlySalaryBill()));
					break;
				}
				case 4:
				{
					System.out.println("Thông tin của các lập trình viên:");
					System.out.println(sf.displayListProgrammers());
					break;
				}
				case 5:{
					List<Employee1> th = sf.sortAllStaffByName();
					if (th.isEmpty())
						System.out.println("Không có nhân viên  nào");
					else
						System.out.println("Danh sách nhân viên sắp xếp theo tên  là:");
					for (Employee1 employee1 : th) 
						System.out.println(sf.xuatDS(employee1));
					break;
					
				}
				case 6:
				{
					System.out.println("Nhập mã số người quản lí muốn sửa: ");
					int m = Integer.parseInt(scan.nextLine());
					System.out.println("Nhập  tên phòng bạn muốn sửa thành: ");
					String c = scan.nextLine();
					if (sf.updateDepartmentForAdmin(c, m)) {
						System.out.println("Sửa thành công");
						System.out.println(sf.displayAllStaff());
					} else
						System.out.println("Sửa thất bại");
					break;
				}
				case 7:
				{
					System.out.println("Mời bạn nhập vô mã phòng muốn xóa:");
					int a = scan.nextInt();
					if (sf.deleteEmployee(a)) {
						System.out.println("xóa thành công");
						System.out.println(sf.displayAllStaff());
					} else
						System.out.println("3thất bại!");
					break;
				}
				default:
					System.out.println("sai cu phap!");
				}
				
			}while(choose!=0);
			System.out.println("Thoat thanh cong!");
		
	}
}
