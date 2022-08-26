package t5_TienDien;

import java.time.LocalDate;

public class TestTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListKhachHang l = new ListKhachHang();
		l.ThemKhachHang(new VietNam("VN1","Toan",LocalDate.of(2012, 9, 3),200,3500,"SH",150));
		l.ThemKhachHang(new VietNam("VN2","Van",LocalDate.of(2012, 7, 5),150,3500,"KD",150));
		l.ThemKhachHang(new VietNam("VN3","Nguyen",LocalDate.of(2013, 8, 4),100,3500,"SX",150));
		l.ThemKhachHang(new NuocNgoai("NN1","He", LocalDate.of(2014, 8, 10),200,3500,"USA"));
		l.ThemKhachHang(new NuocNgoai("NN2","Thi", LocalDate.of(2013, 7, 10),300,3500,"USA"));
		l.ThemKhachHang(new NuocNgoai("NN3","Phan", LocalDate.of(2013, 9, 10),400,3500,"USA"));
		l.XuatKhachHang();
		l.TinhTongTungLoai();
		l.TinhTBThanhTien();
		l.HoaDonThang9();
	}

}
