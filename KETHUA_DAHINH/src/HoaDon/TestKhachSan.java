package HoaDon;

import java.time.LocalDate;

public class TestKhachSan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListHoaDon l = new ListHoaDon();
		l.ThemHoaDon(new TheoGio("G1", LocalDate.of(2012, 5, 7),"Toan","A1",50000,10));
		l.ThemHoaDon(new TheoGio("G2", LocalDate.of(2012, 5, 7),"Toan","A3",50000,15));
		l.ThemHoaDon(new TheoGio("G3", LocalDate.of(2012, 6, 7),"Toan","A5",50000,33));
		l.ThemHoaDon(new TheoNgay("N4", LocalDate.of(2012, 7, 7),"Toan","B2",50000,5));
		l.ThemHoaDon(new TheoNgay("N3", LocalDate.of(2013, 8, 7),"Toan","B3",50000,7));
		l.ThemHoaDon(new TheoNgay("N2", LocalDate.of(2012, 5, 7),"Toan","B4",50000,0));
		l.XuatHoaDon();
		l.ThongKeSoLuongHoaDon();
		l.TinhTongThanhTien(5, 2012);
	}
}
