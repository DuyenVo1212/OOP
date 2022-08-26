package Tuan9_HangHoa;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Test {
	public static int  menu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nMenu: ");
		System.out.println("1. Them mot loai hang hoa");
		System.out.println("2. Xem toan bo hang hoa");
		System.out.println("3. Lay thong tin tung loai hang hoa");
		System.out.println("4. Tim kiem theo ma");
		System.out.println("5. Sap xep tang theo ten hang hoa");
		System.out.println("6. Sap xep giam theo so luong ton");
		System.out.println("7. Lay thong tin hang thuc pham kho ban");
		System.out.println("8. Xoa hang hoa khi biet ma");
		System.out.println("9. Sua thong tin don gia khi biet ma hang");
		System.out.println("0. thoat!!");
		System.out.print("Chon: ");
		int chon=scan.nextInt();
		return chon;
	}
	public static void main(String[] args) throws Exception {
		DanhSachHangHoa ds = new DanhSachHangHoa();
		ds.themHangHoa(new HangThucPham("4", "Mức", 2000, 30, "CTyB", LocalDate.of(2020, 1, 2), LocalDate.of(2021, 1, 2)));
		ds.themHangHoa(new HangThucPham("2", "Cải", 3000, 0, "CTyC", LocalDate.of(2020, 1, 2), LocalDate.of(2021, 1, 2)));
		ds.themHangHoa(new HangDienMay("5", "Máy lạnh", 200, 1, 5, 2000));
		ds.themHangHoa(new HangDienMay("1", "Máy giặc", 4000, 10, 12, 3000));
		ds.themHangHoa(new HangSanhSu("3", "Chén", 5000, 5, "CTYA", LocalDate.of(2021, 11, 18)));
		ds.themHangHoa(new HangSanhSu("6", "Nồi", 1000, 3, "CTYD", LocalDate.of(2022, 11, 18)));
		
		Scanner scan=new Scanner(System.in);
		int choose;
		 do
			{
				choose=menu();
				switch (choose) {
				case 0: {
					break;
				}
				case 1:{ 
					//them cung, trung ma --> nen them ko dc
					if(ds.themHangHoa(new HangSanhSu("6", "Nồi", 1000, 3, "CTYD", LocalDate.of(2022, 11, 18)))) 
						System.out.println("them thanh cong!!");
					else System.out.println("them that bai, da ton tai!!");
					break;
				}
				case 2:{
					System.out.println(ds);
					break;
				}
				case 3:
				{
					System.out.println("1. Hang thuc pham");
					System.out.println("2. Hang dien may");
					System.out.println("3. Hang sanh su");
					System.out.print("Chon: ");
					int chon=scan.nextInt();
					if(chon ==1) System.out.println(ds.xuatTP());
					else if(chon==2) System.out.println(ds.xuatDM());
					else System.out.println(ds.xuatSS());
					break;
				}
				case 4:
				{
					System.out.println("Nhập mã hàng hóa muốn tìm: ");
					String maHangHoa = scan.nextLine();
					System.out.println(ds.timKiem(maHangHoa));
					break;
				}
				case 5:{
					System.out.println("Danh sách hàng hóa sắp xếp theo tên tăng dần là: ");
					ds.sapXepTangDanTheoTen();
					System.out.println(ds);
					break;
				}
				case 6:
				{
					List<HangHoa> sl = ds.SapXepGiamSoLuong();
					if (sl.size() == 0)
						System.out.println("Không có hàng hóa nào");
					else
						System.out.println("Danh sách hàng sắp xếp giảm theo số lượng tồn là:");
					for (HangHoa hangHoa : sl) {
						System.out.println(hangHoa);
					}
					break;
				}
				case 7:
				{
					List<HangHoa> lh = ds.layDSKhoBan();
					if (lh.size() == 0)
						System.out.println("Không có hàng hóa nào");
					else
						System.out.println("Danh sách hàng hóa khó bán là:");
					for (HangHoa hangHoa : lh) {
						System.out.println(hangHoa);
					}
					break;
				}
				case 8:
				{
					System.out.println("Nhập mã hàng hóa muốn xóa: ");
					String ma = scan.nextLine();
					if (ds.xoaHangHoa(ma)) {
						System.out.println("Xóa thành công");
						System.out.println(ds);
					} else
						System.out.println("Xóa thất bại");
					break;
				}
				case 9:
				{
					System.out.println("Nhập mã hàng hóa muốn sửa: ");
					String m1 = scan.nextLine();
					System.out.println("Nhập đơn giá hàng hóa muốn sửa thành: ");
					double c1 = scan.nextDouble();
					if (ds.suaDonGia(m1, c1)) {
						System.out.println("Sửa thành công");
						System.out.println(ds);
					} else
						System.out.println("Sửa thất bại");
					break;
				}
				default:
					System.out.println("sai cu phap!");
				}
				
			}while(choose!=0);
			System.out.println("Thoat thanh cong!");
	}
}
